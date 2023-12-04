package com.example.coursework.web.dto.article;

import com.example.coursework.models.user.User;
import com.example.coursework.web.dto.user.UserDTO;
import lombok.Data;

import java.sql.Date;

@Data
public class ArticleDTO {
    private long id;
    private String photo_url;
    private String body_url;
    private String header;
    private Date creation_date;
    private UserDTO user;
}
