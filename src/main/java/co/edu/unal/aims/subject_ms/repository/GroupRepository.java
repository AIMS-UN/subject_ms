package co.edu.unal.aims.subject_ms.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unal.aims.subject_ms.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, UUID> {

     Group findByGroupId(UUID groupId);

}
