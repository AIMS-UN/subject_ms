package co.edu.unal.aims.subject_ms.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.ClassGroups;
import co.edu.unal.aims.subject_ms.repository.ClassGroupRepository;

@Service
public class ClassGroupServiceImpl implements ClassGroupService {

    @Autowired
    private ClassGroupRepository classGroupRepository;

    @Override
    public ClassGroups buscarPorClassGroupId(UUID classGroupId) {
        return classGroupRepository.findByClassGroupId(classGroupId);
    }

}
