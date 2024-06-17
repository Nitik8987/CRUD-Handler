package com.project.crudhandler.controller;

import com.project.crudhandler.model.User;
import com.project.crudhandler.service.UserServiceI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserServiceI userServiceI;

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = userServiceI.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }
}
