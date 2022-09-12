package co.edu.unal.aims.subject_ms.service;

import co.edu.unal.aims.subject_ms.model.subjects.Subjects;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SubjectService {
    List<Subjects> buscarPorNombre (String name);
    List<Subjects> buscarPorCodigo (Integer code);
    List<Subjects> buscarPorCarrera (Integer career);

}
