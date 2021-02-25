package com.cybershepherd.KZPrototype.order;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class RentOrder {
//    TODO: Define nonnullable columns
    @Id
    @SequenceGenerator(
            name = "rentorder_sequence",
            sequenceName = "rentorder_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rentorder_sequence"
    )
    private Long id;
    private Long lodgeId;
    private Long personId;
    private LocalDate arrival;
    private LocalDate department;
}
