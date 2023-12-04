package com.example.coursework.controllers;

import com.example.coursework.services.user.UserService;
import com.example.coursework.web.dto.user.UserDTO;
import com.example.coursework.web.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    private UserMapper userMapper;
    @GetMapping("/users")
    private ResponseEntity<List<UserDTO>> allUsers() {
        var users = userMapper.fromUsersList(userService.getAllUsers());
        if (users == null || users.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
