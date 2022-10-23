package co.edu.unal.aims.subject_ms.model;

import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "class_groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "uuid-char")
    @Column(name = "groupId", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID groupId;

    @Column(name = "max_capacity", nullable = false)
    private Integer maxCapacity;

    @Column(name = "teacher_id", nullable = false)
    private String teacherId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id")
    @JsonBackReference
    private Subject subject;

}
