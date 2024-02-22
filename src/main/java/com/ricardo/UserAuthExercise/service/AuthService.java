package com.ricardo.UserAuthExercise.service;

import com.ricardo.UserAuthExercise.domain.User;
import com.ricardo.UserAuthExercise.entity.UserDto;
import com.ricardo.UserAuthExercise.exceptions.NotMatchingException;
import com.ricardo.UserAuthExercise.exceptions.UserNotFoundException;
import com.ricardo.UserAuthExercise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public String login(UserDto userDto) {
        User user = userRepository.getUserByUsername(userDto.getUsername());
        if (user == null) throw new UserNotFoundException();
        if (!user.getPassword().equals(userDto.getPassword())) throw new NotMatchingException();

        return "Logged in.";
    }
}
