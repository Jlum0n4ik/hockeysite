package com.example.coursework.web.dto.user;

import com.example.coursework.models.user.Role;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class UserDTO {
    private long id;
    private String email;
    private Role role;
}
