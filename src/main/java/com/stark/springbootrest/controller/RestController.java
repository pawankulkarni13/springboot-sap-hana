package com.stark.springbootrest.controller;

import com.stark.springbootrest.domain.User;
import com.stark.springbootrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String sayingHello(){
        System.out.println("Saying Hellow ");
        return "Hello World from Pawan !!!";
    }

    @GetMapping("/user")
    public List<User> getUsers(){
        System.out.println("Getting All Users");
        return userRepository.findAll();
    }

    @PostMapping(value = "/user", consumes = "application/json")
    public void saveUser(@RequestBody User user){
        System.out.println("Saving User");
        userRepository.save(user);
        System.out.println("Saved User");
    }
}
