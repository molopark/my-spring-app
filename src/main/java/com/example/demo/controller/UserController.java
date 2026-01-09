package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userMapper.findAll();
    }
}