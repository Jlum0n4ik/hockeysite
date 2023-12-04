package com.example.coursework.web.dto.game;

import com.example.coursework.models.game.GameStatus;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class GameDTO {
    private long id;
    private Date date;
    private Time time;
    private int attendance;
    private GameStatus gameStatus;
}
