package com.ricardo.UserAuthExercise.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)

public class NotMatchingException extends RuntimeException {
    public NotMatchingException() {
        super("Username or Password not matching!");
    }
}
