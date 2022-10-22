package co.edu.unal.aims.subject_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.Subjects;
import co.edu.unal.aims.subject_ms.repository.SubjectRepository;

@Service
public class SubjectServicesImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subjects> buscarPorNombre(String name) {
        return subjectRepository.findByName(name);
    }

    @Override
    public List<Subjects> buscarPorCodigo(String code) {
        return subjectRepository.findByCode(code);
    }

    @Override
    public List<Subjects> buscarPorCarrera(Integer career) {
        return subjectRepository.findByCareer(career);
    }

}
