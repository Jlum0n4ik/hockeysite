package com.example.coursework.web.dto.player;

import com.example.coursework.web.dto.game.GameDTO;
import com.example.coursework.web.dto.team.TeamDTO;
import lombok.Data;

import java.sql.Time;

@Data
public class PlayerStatsDTO {
    private long id;
    private TeamDTO team;
    private PlayerDTO player;
    private Time icetime;
    private GameDTO game;
}
