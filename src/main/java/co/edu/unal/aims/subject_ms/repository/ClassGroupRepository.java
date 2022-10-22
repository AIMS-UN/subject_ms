package co.edu.unal.aims.subject_ms.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unal.aims.subject_ms.model.ClassGroups;

@Repository
public interface ClassGroupRepository extends JpaRepository<ClassGroups, UUID> {

     ClassGroups findByClassGroupId(UUID classGroupId);

}
