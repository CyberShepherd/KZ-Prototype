package com.cybershepherd.KZPrototype.person;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/person")
@AllArgsConstructor
public class PersonController {
    private final PersonService service;

    //TODO: Add service implementation
    @PostMapping
    public ResponseEntity addPerson(@RequestBody Person person){
        return service.addPerson(person);
    }
}
