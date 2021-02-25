package com.cybershepherd.KZPrototype.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RentOrderController {
    @PostMapping
    public ResponseEntity reserveLodge(@RequestBody RentOrder order){
        return null;
    }
}
