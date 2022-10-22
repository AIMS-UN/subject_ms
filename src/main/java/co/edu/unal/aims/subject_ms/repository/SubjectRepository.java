package co.edu.unal.aims.subject_ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unal.aims.subject_ms.model.Subjects;

@Repository
public interface SubjectRepository extends JpaRepository<Subjects, Integer> {

    List<Subjects> findByName(String name);

    List<Subjects> findByCode(String code);

    List<Subjects> findByCareer(Integer career);

}
