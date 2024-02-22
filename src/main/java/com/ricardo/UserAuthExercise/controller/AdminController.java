package com.ricardo.UserAuthExercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin")
    public String getAccount() {
        return "You don't have access to admin page!";
    }
}
