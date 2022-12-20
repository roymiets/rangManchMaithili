package com.RangManchMaithili.RangmanchMaithili.controller;

import com.RangManchMaithili.RangmanchMaithili.entities.User;
import com.RangManchMaithili.RangmanchMaithili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping("/register")
    public void registerUser(@RequestBody User user){
        userService.registerUser(user);
    }
    @GetMapping("/find/{id}")
    public User findUserById(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }

}
