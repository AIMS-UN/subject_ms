package co.edu.unal.aims.subject_ms.service;

import co.edu.unal.aims.subject_ms.model.Subjects;
import co.edu.unal.aims.subject_ms.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServicesImpl implements SubjectService{
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
