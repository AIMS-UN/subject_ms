package co.edu.unal.aims.subject_ms.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unal.aims.subject_ms.model.Group;
import co.edu.unal.aims.subject_ms.repository.GroupRepository;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public List<Group> getAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group getByGroupId(UUID groupId) {
        return groupRepository.findByGroupId(groupId);
    }

}
