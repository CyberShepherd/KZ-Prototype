package com.cybershepherd.KZPrototype.lodge;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LodgeService {
    private final LodgeRepository repository;

    public ResponseEntity getAllLodges(){
        List<Lodge> lodges = repository.findAll();
        return new ResponseEntity<List<Lodge>>(lodges,HttpStatus.OK);
    }
}
