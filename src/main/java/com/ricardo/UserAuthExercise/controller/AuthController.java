package com.ricardo.UserAuthExercise.controller;

import com.ricardo.UserAuthExercise.entity.UserDto;
import com.ricardo.UserAuthExercise.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    public AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody UserDto userDto) {
        return authService.login(userDto);
    }
}
