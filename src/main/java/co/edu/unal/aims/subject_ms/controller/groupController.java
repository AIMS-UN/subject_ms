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
    public ResponseEntity<List<Group>> getGroups() {
        return ResponseEntity.ok(groupService.findAll());
    }

    @GetMapping("/{groupId}")
    public ResponseEntity<Group> getGroup(@PathVariable("groupId") UUID groupId) {
        Group group = groupService.findById(groupId);

        if (group == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(group);
    }

}
