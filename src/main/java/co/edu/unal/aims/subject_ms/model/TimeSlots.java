package co.edu.unal.aims.subject_ms.model;

import java.sql.Time;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeSlots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer time_slot_id;

    private Time start_time;

    private Time end_time;

}
