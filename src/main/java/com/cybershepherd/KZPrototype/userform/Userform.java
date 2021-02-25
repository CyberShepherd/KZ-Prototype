package com.cybershepherd.KZPrototype.userform;

import com.cybershepherd.KZPrototype.lodge.Lodge;
import com.cybershepherd.KZPrototype.order.RentOrder;
import com.cybershepherd.KZPrototype.person.Person;
import lombok.*;

import java.beans.Transient;
import java.time.LocalDate;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Userform {
    private String name;
    private String lastname;
    private String pesel;
    private String email;
    private String phoneNum;
    private String address;
    private String apartment;
    private String postalCode;
    private String city;
    private LocalDate arrival;
    private LocalDate department;
    private Long lodgeId;

    @Transient
    public Person getPerson(){
        return Person.builder()
                .pesel(this.pesel)
                .fullname(this.name + " " + this.lastname)
                .address(this.address)
                .apartment(this.apartment)
                .postalCode(this.postalCode)
                .city(this.city)
                .email(this.email)
                .phoneNumber(this.phoneNum)
                .build();
    }

    @Transient
    public Lodge getLodge(){
        return Lodge.builder()
                .id(lodgeId)
                .build();
    }

    @Transient
    public RentOrder getRentOrder(){
        return RentOrder.builder()
                .arrival(this.arrival)
                .department(this.department)
                .clientPesel(this.pesel)
                .lodgeId(this.lodgeId)
                .build();
    }
}
