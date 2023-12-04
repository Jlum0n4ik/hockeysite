package com.example.coursework.web.dto.team;

import com.example.coursework.web.dto.user.UserDTO;
import lombok.Data;

@Data
public class TeamStatsDTO {
    private int id;
    private int goalsFor;
    private int goalsAgainst;
    private int ppAttempts;
    private int ppGoals;
    private TeamDTO team;
    private UserDTO user;
}
