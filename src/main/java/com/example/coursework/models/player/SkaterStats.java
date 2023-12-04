package com.example.coursework.models.player;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "skater_stats")
public class SkaterStats {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToOne
    @JoinColumn(name = "player_stat_id", referencedColumnName = "id")
    private PlayerStats playerStats;
    private int goals_count;
    private int assists_count;
    private int penalty_minutes;
    private int shots_made;
    private int face_offs_count;
    private int face_offs_wins;
}
