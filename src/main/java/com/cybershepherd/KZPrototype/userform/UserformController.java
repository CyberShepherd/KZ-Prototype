package com.cybershepherd.KZPrototype.userform;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/useform")
@AllArgsConstructor
public class UserformController {
    private final UserformService userformService;

    @PostMapping
    public ResponseEntity sumbitUserform(@RequestBody Userform userform){
        return userformService.submitUserform(userform);
    }
}
