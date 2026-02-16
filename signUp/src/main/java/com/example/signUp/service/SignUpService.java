package com.example.signUp.service;

import com.example.signUp.model.SignUp;
import com.example.signUp.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SignUpService {

    @Autowired
    private SignUpRepository repository;
    public SignUp registerUser(SignUp user) {
        return repository.save(user);
    }
    public List<SignUp> getAllUsers() {
        return repository.findAll();
    }
}
