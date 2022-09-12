package co.edu.unal.aims.subject_ms.model.subjects;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


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
    private Subjects subjects;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn()
    private ClassGroups classGroups;
}
