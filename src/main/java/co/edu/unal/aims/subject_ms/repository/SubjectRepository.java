package co.edu.unal.aims.subject_ms.repository;

import co.edu.unal.aims.subject_ms.model.subjects.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subjects, Integer> {
    List<Subjects> findByName(String name);
    List<Subjects> findByCode(Integer code);
    List<Subjects> findByCareer(Integer career);


}
