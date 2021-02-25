package com.cybershepherd.KZPrototype.lodge;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Lodge {
//    TODO: define non-nullable colums
    @Id
    @SequenceGenerator(
            name = "lodge_sequence",
            sequenceName = "lodge_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "lodge_sequence"
    )
    private Long id;
    private String name;
    private Long dailyPrice;
}
