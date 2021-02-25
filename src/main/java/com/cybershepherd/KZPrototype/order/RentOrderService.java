package com.cybershepherd.KZPrototype.order;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RentOrderService {
    private final RentOrderRepository repository;

    public ResponseEntity addRentOrder(RentOrder rentOrder){
        repository.save(rentOrder);
        return new ResponseEntity(HttpStatus.OK);
    }

    public List<RentOrder> checkRentOrder(RentOrder rentOrder){
        return repository.findOrdersBetweenDates(rentOrder.getLodgeId(), rentOrder.getArrival(), rentOrder.getDepartment());
    }
}
