package co.edu.unal.aims.subject_ms.service;

import co.edu.unal.aims.subject_ms.model.ClassGroups;
import co.edu.unal.aims.subject_ms.repository.ClassGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.List;

@Service
public class ClassGroupServiceImpl implements ClassGroupService{
    @Autowired
    private ClassGroupRepository  classGroupRepository;
    @Override
    public ClassGroups buscarPorClassGroupId(UUID classGroupId) {
        return classGroupRepository.findByClassGroupId(classGroupId);
    }


}
