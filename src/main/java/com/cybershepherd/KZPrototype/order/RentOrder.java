package com.cybershepherd.KZPrototype.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
