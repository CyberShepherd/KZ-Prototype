package com.cybershepherd.KZPrototype.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentOrder {
    private LocalDate arrival;
    private LocalDate department;
    private String lodgeName;

}
