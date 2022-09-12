package co.edu.unal.aims.subject_ms.model.subjects;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Requirements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer requeriment_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn()
    private Subjects subjects;
}
