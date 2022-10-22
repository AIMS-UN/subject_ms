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
    public ResponseEntity<List<Subject>> listSubjects(
            @RequestParam(name = "career_id", required = false) Integer careerId) {
        List<Subject> subjects = new ArrayList<>();

        if (careerId == null) {
            subjects = subjectService.getAll();
        } else {
            subjects = subjectService.getAllByCareerId(careerId);
        }

        if (subjects.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(subjects);
    }

    @GetMapping("/{subject_code}")
    public ResponseEntity<Subject> getSubject(@PathVariable("subject_code") String subjectCode) {
        Subject subject = subjectService.getBySubjectCode(subjectCode);

        if (subject == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(subject);
    }

}
