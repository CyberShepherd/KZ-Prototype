package com.cybershepherd.KZPrototype.lodge;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LodgeService {
    private final LodgeRepository repository;
}
