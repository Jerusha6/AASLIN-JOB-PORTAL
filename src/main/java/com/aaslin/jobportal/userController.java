package com.aaslin.jobportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class userController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public void addUser(){

    }

    @GetMapping("/")
    public String returnsome(){
        return "heloo";
    }
}
