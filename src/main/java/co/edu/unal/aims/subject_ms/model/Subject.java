package co.edu.unal.aims.subject_ms.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, updatable = false, nullable = false)
    private Integer subjectId;

    @Column(nullable = false)
    private String subjectName;

    @Column(unique = true, nullable = false)
    private String subjectCode;

    @Column(nullable = false)
    private Integer careerId;

    private String curriculum;

    private Integer credits;

    @OneToMany(mappedBy = "subject", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("subject")
    @Column(nullable = true)
    private List<Group> groups;

}
