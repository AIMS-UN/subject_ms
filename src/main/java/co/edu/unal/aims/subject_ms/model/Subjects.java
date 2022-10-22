package co.edu.unal.aims.subject_ms.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subject_id;

    private String name;

    private String curriculum;

    private Integer credits;

    private String code;

    private Integer career;

}
