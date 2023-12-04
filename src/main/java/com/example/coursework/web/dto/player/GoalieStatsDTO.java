package com.example.coursework.web.dto.player;
import lombok.Data;

@Data
public class GoalieStatsDTO {
    private long id;
    private PlayerStatsDTO playerStats;
    private int savesCount;
    private int shotsFaced;
    private int goalsAgainst;
}
