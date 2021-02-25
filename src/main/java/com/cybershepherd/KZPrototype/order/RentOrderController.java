package com.cybershepherd.KZPrototype.order;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

//TODO delete if no use
@RestController
@RequestMapping(path = "/api/rentorder")
@AllArgsConstructor
public class RentOrderController {
    private final RentOrderService service;

}
