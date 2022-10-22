package co.edu.unal.aims.subject_ms.model;

import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassGroups {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "uuid-char")
    @Column(name = "classGroupId", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID classGroupId;

    private Integer max_capacity;

    private String teacher_id;

}
