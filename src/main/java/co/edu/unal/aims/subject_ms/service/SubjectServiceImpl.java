package co.edu.unal.aims.subject_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.Subject;
import co.edu.unal.aims.subject_ms.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getBySubjectCode(String subjectCode) {
        return subjectRepository.findBySubjectCode(subjectCode);
    }

    @Override
    public List<Subject> getAllByCareerId(Integer careerId) {
        return subjectRepository.findByCareerId(careerId);
    }

}
