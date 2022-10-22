package co.edu.unal.aims.subject_ms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.Subject;

@Service
public interface SubjectService {

    List<Subject> getAll();

    Subject getBySubjectCode(String subjectCode);

    List<Subject> getAllByCareerId(Integer careerId);

}
