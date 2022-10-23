package co.edu.unal.aims.subject_ms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.Subject;

@Service
public interface SubjectService {

    Subject findById(Integer subjectId);

    List<Subject> findAll();

    List<Subject> findAllBySubjectCode(String subjectCode);

    List<Subject> findAllByCareerId(Integer careerId);

    List<Subject> findAllBySubjectName(String subjectName);

}
