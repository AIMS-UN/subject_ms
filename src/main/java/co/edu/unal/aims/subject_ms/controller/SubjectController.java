package co.edu.unal.aims.subject_ms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.unal.aims.subject_ms.model.Subject;
import co.edu.unal.aims.subject_ms.service.SubjectService;

@RestController
@RequestMapping(value = "/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public ResponseEntity<List<Subject>> getSubjects(
            @RequestParam(name = "subjectCode", required = false) String subjectCode,
            @RequestParam(name = "careerId", required = false) Integer careerId,
            @RequestParam(name = "subjectName", required = false) String subjectName) {
        List<Subject> subjects = new ArrayList<>();

        if (subjectCode != null) {
            subjects = subjectService.findAllBySubjectCode(subjectCode);
        } else if (careerId != null) {
            subjects = subjectService.findAllByCareerId(careerId);
        } else if (subjectName != null) {
            subjects = subjectService.findAllBySubjectName(subjectName);
        } else {
            subjects = subjectService.findAll();
        }

        return ResponseEntity.ok(subjects);
    }

    @GetMapping(value = "/{subjectId}")
    public ResponseEntity<Subject> getSubject(@PathVariable("subjectId") Integer subjectId) {
        Subject subject = subjectService.findById(subjectId);

        if (subject == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(subject);
    }

}
