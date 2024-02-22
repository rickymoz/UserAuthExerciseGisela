package com.ricardo.UserAuthExercise.controller;

import com.ricardo.UserAuthExercise.domain.User;
import com.ricardo.UserAuthExercise.entity.UserDto;
import com.ricardo.UserAuthExercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.addUser(userDto));
    }
}
