package co.edu.unal.aims.subject_ms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.Subjects;

@Service
public interface SubjectService {

    List<Subjects> buscarPorNombre(String name);

    List<Subjects> buscarPorCodigo(String code);

    List<Subjects> buscarPorCarrera(Integer career);

}
