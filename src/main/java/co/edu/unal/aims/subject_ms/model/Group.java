package co.edu.unal.aims.subject_ms.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    @Column(insertable = false, updatable = false, nullable = false)
    private UUID groupId;

    @Column(nullable = false)
    private Integer maxCapacity;

    @Column(nullable = false)
    private String teacherId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("groups")
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @OneToMany(mappedBy = "group", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("group")
    @Column(nullable = true)
    private List<Schedule> schedules;

}
