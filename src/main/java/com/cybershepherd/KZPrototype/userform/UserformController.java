package com.cybershepherd.KZPrototype.userform;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/useform")
@AllArgsConstructor
public class UserformController {
    private final UserformService userformService;

    @PostMapping
    public ResponseEntity sumbitUserform(@RequestBody Userform userform){
        return userformService.submitUserform(userform);
    }

//    TODO: Remove when not needed
    @GetMapping ResponseEntity getSimpleUserform(){
        Userform userform = Userform.builder()
                .name("gabriel")
                .lastname("modzelewski")
                .pesel("95053102255")
                .email("gabriel.m@op.pl")
                .phoneNum("+48607203565")
                .address("Alfonsa Kawki 7")
                .apartment("34")
                .postalCode("84-322")
                .city("warsaw")
                .lodge("Jaworzynka")
                .arrival(LocalDate.of(2021, 5, 11))
                .department(LocalDate.of(2021, 5, 22))
                .build();
        return new ResponseEntity<Userform>(userform, HttpStatus.OK);

    }
}
