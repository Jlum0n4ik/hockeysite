package com.example.coursework.web.dto.player;

import lombok.Data;

@Data
public class SkaterStatsDTO {
    private long id;
    private PlayerStatsDTO playerStats;
    private int goals_count;
    private int assists_count;
    private int penalty_minutes;
    private int shots_made;
    private int face_offs_count;
    private int face_offs_wins;
}
