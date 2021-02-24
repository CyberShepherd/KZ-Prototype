package com.cybershepherd.KZPrototype.lodge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Lodge {
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
    private boolean paymentBooked;
}
