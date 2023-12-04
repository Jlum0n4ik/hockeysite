package com.example.coursework.web.dto.player;

import com.example.coursework.models.player.Position;
import lombok.Data;

import java.sql.Date;

@Data
public class PlayerDTO {
    private long id;
    private Date date_of_birth;
    private String fname;
    private String lname;
    private int weight;
    private int height;
    private String photo_url;
    private Position position;
}
