package com.ricardo.UserAuthExercise.service;

import com.ricardo.UserAuthExercise.domain.User;
import com.ricardo.UserAuthExercise.entity.UserDto;
import com.ricardo.UserAuthExercise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User addUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setPassword(userDto.getRole());

        return userRepository.save(user);
    }
}
