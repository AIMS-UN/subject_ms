package co.edu.unal.aims.subject_ms.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schedule_id;

    private Integer day;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn()
    private TimeSlots timeSlots;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn()
    private ClassGroups classGroups;

}
