package com.cybershepherd.KZPrototype.userform;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/userform")
@AllArgsConstructor
public class UserformController {
    private final UserformService userformService;

    @PostMapping
    public ResponseEntity sumbitUserform(@RequestBody Userform userform){
        return userformService.submitUserform(userform);
    }

}
