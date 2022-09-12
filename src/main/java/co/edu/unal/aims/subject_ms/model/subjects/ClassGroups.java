package co.edu.unal.aims.subject_ms.model.subjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer class_group_id;
    private Integer max_capacity;
    private String teacher_id;

}
