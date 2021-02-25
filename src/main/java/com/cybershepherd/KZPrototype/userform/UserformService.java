package com.cybershepherd.KZPrototype.userform;

import com.cybershepherd.KZPrototype.lodge.LodgeService;
import com.cybershepherd.KZPrototype.order.RentOrderService;
import com.cybershepherd.KZPrototype.person.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserformService {
    private final RentOrderService rentOrderService;
    private final PersonService personService;
    private final LodgeService lodgeService;

    public ResponseEntity submitUserform(Userform userform){

        return new ResponseEntity(HttpStatus.OK);
    }
}
