package com.cybershepherd.KZPrototype.person;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Person {
//    TODO: Define nonnullable columns
    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    private Long id;
    private String pesel;
    private String fullname;
    private String address;
    private String apartment;
    private String postalCode;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;
}
