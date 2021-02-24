package com.cybershepherd.KZPrototype.lodge;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/lodge")
@AllArgsConstructor
public class LodgeController {
    private final LodgeService service;
}
