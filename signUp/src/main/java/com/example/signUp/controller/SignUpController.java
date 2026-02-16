package com.example.signUp.controller;

import java.util.List;

import com.example.signUp.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.signUp.service.SignUpService;

@RestController
@CrossOrigin(origins = "*")
public class SignUpController {

    @Autowired
    private SignUpService service;
    @PostMapping("/signup")
    public SignUp signup(@RequestBody SignUp user) {
        return service.registerUser(user);
    }

    @GetMapping("/users")
    public List<SignUp> getUsers() {
        return service.getAllUsers();
    }
}

