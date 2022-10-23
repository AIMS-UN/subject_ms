package co.edu.unal.aims.subject_ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unal.aims.subject_ms.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    List<Subject> findAllBySubjectCode(String subjectCode);

    List<Subject> findAllByCareerId(Integer careerId);

    List<Subject> findAllBySubjectName(String subjectName);

}
