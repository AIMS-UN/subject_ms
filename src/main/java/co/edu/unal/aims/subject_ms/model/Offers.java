package co.edu.unal.aims.subject_ms.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer group_id;

    private String level;

    private String tipology;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn()
    private Subject subjects;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn()
    private Group groups;

}
