package com.cybershepherd.KZPrototype.userform;

import com.cybershepherd.KZPrototype.lodge.Lodge;
import com.cybershepherd.KZPrototype.order.RentOrder;
import com.cybershepherd.KZPrototype.person.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Userform {
    private String name;
    private String lastname;
    private String pesel;
    private String email;
    private String phoneNum;
    private String adress;
    private String apartment;
    private String postalCode;
    private String city;
    private String lodge;
    private LocalDate arrival;
    private LocalDate department;

    public Person getPerson(){
        return Person.builder()
                .pesel(this.pesel)
                .fullname(this.name + " " + this.lastname)
                .address(this.adress)
                .apartment(this.apartment)
                .postalCode(this.postalCode)
                .city(this.city)
                .email(this.email)
                .phoneNumber(this.phoneNum)
                .build();
    }

    public Lodge getLodge(){
        return Lodge.builder()
                .name(this.lodge)
                .build();
    }

    public RentOrder getRentOrder(){
        return RentOrder.builder()
                .arrival(this.arrival)
                .department(this.department)
                .clientPesel(this.pesel)
                .lodgeName(this.lodge)
                .build();
    }
}
