package com.example.authservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {



    @PostMapping("/login")
    public ResponseEntity<?> login(
    ) {
        // set cookie tại đây
        return ResponseEntity.ok("Login successful");
    }


}
