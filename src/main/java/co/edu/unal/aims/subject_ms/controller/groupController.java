package co.edu.unal.aims.subject_ms.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.unal.aims.subject_ms.model.Group;
import co.edu.unal.aims.subject_ms.service.GroupService;

@RestController
@RequestMapping(value = "/groups")
public class groupController {

    private final GroupService groupService;

    @Autowired
    public groupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public ResponseEntity<List<Group>> getAll() {
        return ResponseEntity.ok(groupService.getAll());
    }

    @GetMapping("/{group_id}")
    public ResponseEntity<Group> getGroup(@PathVariable("group_id") UUID groupId) {
        Group group = groupService.getByGroupId(groupId);

        if (group == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(group);
    }

}
