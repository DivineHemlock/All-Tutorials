package com.example.chaddarbyspringsecurity;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String test(Authentication authentication) {
        return "user :" + authentication.getName()+ "\n" + "test " + authentication.getAuthorities();
    }



}
