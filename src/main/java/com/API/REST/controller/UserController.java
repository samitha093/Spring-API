package com.API.REST.controller;

import com.API.REST.model.Users;
import com.API.REST.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userservice;

    @GetMapping("/get")
    public String getdata(){
        return "get request";
    }
    @PostMapping("/user")
    public String postdata(@RequestBody Users user){
        return userservice.saveUser(user);
    }
    @GetMapping("/user")
    public Iterable<Users> getalldata(){
        return userservice.findall();
    }
    @GetMapping("/user/{id}")
    public Optional<Users> getiddata(@PathVariable Integer id){
        return userservice.findid(id);
    }
    @PutMapping("/put")
    public String putdata(){
        return "put request";
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "delete request";
    }
}
