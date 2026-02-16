package com.example.signUp.repository;

import com.example.signUp.model.SignUp;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SignUpRepository extends MongoRepository<SignUp, String> {
}
