package com.cybershepherd.KZPrototype.order;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RentOrderService {
    private final RentOrderRepository repository;

//    TODO add availability check
    public ResponseEntity addRentOrder(RentOrder rentOrder){
        repository.save(rentOrder);
        return new ResponseEntity(HttpStatus.OK);
    }
}
