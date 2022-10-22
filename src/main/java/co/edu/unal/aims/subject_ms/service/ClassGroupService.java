package co.edu.unal.aims.subject_ms.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.ClassGroups;

@Service
public interface ClassGroupService {

    ClassGroups buscarPorClassGroupId(UUID classGroupId);

}
