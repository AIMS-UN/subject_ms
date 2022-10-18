package co.edu.unal.aims.subject_ms.repository;


import co.edu.unal.aims.subject_ms.model.ClassGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.List;

@Repository
public interface ClassGroupRepository extends JpaRepository< ClassGroups, UUID> {
     ClassGroups findByClassGroupId(UUID classGroupId);
}
