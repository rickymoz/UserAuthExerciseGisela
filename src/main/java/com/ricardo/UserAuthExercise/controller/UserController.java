package com.ricardo.UserAuthExercise.controller;

import com.ricardo.UserAuthExercise.domain.User;
import com.ricardo.UserAuthExercise.entity.UserDto;
import com.ricardo.UserAuthExercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public User addUser(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }
}
