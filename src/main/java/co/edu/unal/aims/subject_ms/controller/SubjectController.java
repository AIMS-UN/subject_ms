package co.edu.unal.aims.subject_ms.controller;

import co.edu.unal.aims.subject_ms.model.Subjects;
import co.edu.unal.aims.subject_ms.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/subjects")
public class SubjectController {

    private final SubjectService subjectService;
    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public ResponseEntity<List<Subjects>> listSubjects(@RequestParam(name="name",required=false) String name,
                                                       @RequestParam(name="code",required=false) String code,
                                                       @RequestParam(name="career",required = false)Integer career){
        //System.out.println(name + " " + code);
        List<Subjects> subjects=new ArrayList<>();
        if(name!=null && code==null && career==null){
            subjects =subjectService.buscarPorNombre(name);
            System.out.println(subjects);
        } else if (name==null && code!=null && career==null) {
            subjects = subjectService.buscarPorCodigo(code);
            System.out.println(subjects);
        } else if (name==null && code==null && career!=null) {
            subjects =subjectService.buscarPorCarrera(career);
            System.out.println(subjects);
        }

        if (subjects==null){
            return ResponseEntity.notFound().build();
        } else if (subjects.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else{
            return ResponseEntity.ok(subjects);
        }

    }




}
