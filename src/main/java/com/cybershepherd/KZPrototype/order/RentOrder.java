package com.cybershepherd.KZPrototype.order;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class RentOrder {
    //TODO: Remove PK and generate PK based on 2 FK
    @Id
    private Long id;
    private Long lodgeId;
    private Long personId;
    private LocalDate arrival;
    private LocalDate department;
    @Transient
    private String clientPesel;
    @Transient
    private String lodgeName;
}
