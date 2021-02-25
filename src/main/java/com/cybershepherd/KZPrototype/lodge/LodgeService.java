package com.cybershepherd.KZPrototype.lodge;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LodgeService {
    private final LodgeRepository repository;

    public ResponseEntity getAllLodges(){
        List<Lodge> lodges = repository.findAll();
        return new ResponseEntity<List<Lodge>>(lodges,HttpStatus.OK);
    }

    public boolean isLodgeOfGivenId(Long id){
        Optional<Lodge> optionalLodge = repository.findById(id);
        if(optionalLodge.isPresent()) return true;
        else return false;
    }
}
