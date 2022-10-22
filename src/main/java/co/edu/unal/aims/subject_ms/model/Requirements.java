package co.edu.unal.aims.subject_ms.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Subject subjects;

}
