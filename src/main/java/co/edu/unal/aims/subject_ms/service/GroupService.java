package co.edu.unal.aims.subject_ms.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.Group;

@Service
public interface GroupService {

    Group findById(UUID groupId);

    List<Group> findAll();

}
