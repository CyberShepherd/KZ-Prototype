package com.cybershepherd.KZPrototype.person;

import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository repository;


//    TODO: Add null check
    /**
     * Checks if person of given pesel already exists. If it doesn't then new
     * person is added to the database.
     * @param person
     * @return
     */
    public ResponseEntity addPerson(Person person){
        Optional<Person> optionalPerson = repository.findPersonByPesel(person.getPesel());
        if(optionalPerson.isPresent()) return new ResponseEntity(HttpStatus.OK);
        repository.save(person);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * finds given person id in the database
     * @param person
     * @return
     */
    public Long findPersonIdByPesel(Person person){
        if(person == null || person.getPesel() == null) return null;
        Optional<Person> optionalPerson = repository.findPersonByPesel(person.getPesel());
        if(optionalPerson.isPresent()) return optionalPerson.get().getId();
        else return null;
    }
}
