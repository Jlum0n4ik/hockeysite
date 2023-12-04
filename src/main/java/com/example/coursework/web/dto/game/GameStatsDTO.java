package com.example.coursework.web.dto.game;

import com.example.coursework.web.dto.team.TeamDTO;
import com.example.coursework.web.dto.user.UserDTO;
import lombok.Data;

@Data
public class GameStatsDTO {
    private long id;
    private GameDTO game;
    private TeamDTO homeTeam;
    private TeamDTO awayTeam;
    private UserDTO user;
}
