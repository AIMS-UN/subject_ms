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
    public Subject findById(Integer subjectId) {
        return subjectRepository.findById(subjectId).orElse(null);
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public List<Subject> findAllBySubjectCode(String subjectCode) {
        return subjectRepository.findAllBySubjectCode(subjectCode);
    }

    @Override
    public List<Subject> findAllByCareerId(Integer careerId) {
        return subjectRepository.findAllByCareerId(careerId);
    }

    @Override
    public List<Subject> findAllBySubjectName(String subjectName) {
        return subjectRepository.findAllBySubjectName(subjectName);
    }

}
