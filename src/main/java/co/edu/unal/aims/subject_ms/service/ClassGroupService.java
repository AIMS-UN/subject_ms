package co.edu.unal.aims.subject_ms.service;

import co.edu.unal.aims.subject_ms.model.ClassGroups;
import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.List;
@Service
public interface ClassGroupService {
    ClassGroups buscarPorClassGroupId (UUID classGroupId);
}
