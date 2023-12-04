package com.example.coursework.web.mappers;

import com.example.coursework.models.user.User;
import com.example.coursework.web.dto.user.UserDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(User user);
    User fromDto(UserDTO userDTO);
    List<UserDTO> fromUsersList(List<User> users);
}
