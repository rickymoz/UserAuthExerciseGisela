package com.ricardo.UserAuthExercise.service;

import com.ricardo.UserAuthExercise.domain.User;
import com.ricardo.UserAuthExercise.entity.UserDto;
import com.ricardo.UserAuthExercise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setRole("user");
        userRepository.save(user);

        return user;
    }
}
