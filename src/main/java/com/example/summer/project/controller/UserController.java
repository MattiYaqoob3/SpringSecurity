package com.example.summer.project.controller;

import com.example.summer.project.models.User;
import com.example.summer.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.netty.udp.UdpServer;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/find/{id")
    public ResponseEntity<?> findOne(@PathVariable String id){
        try {
            return ResponseEntity.ok(userService.findOne(id));
        }catch (NoSuchElementException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No user found");
        }
    }

    public List<User> findAll(){
        return userService.findAll();
    }
}
