package com.example.coursework.services.user;

import com.example.coursework.models.user.User;
import com.example.coursework.repositories.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
