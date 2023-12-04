package com.example.coursework.models.player;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "goalie_stats")
public class GoalieStats {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToOne
    @JoinColumn(name = "player_stat_id", referencedColumnName = "id")
    private PlayerStats playerStats;
    @Column(name = "saves_count")
    private int savesCount;
    @Column(name = "shots_faced")
    private int shotsFaced;
    @Column(name = "goals_against")
    private int goalsAgainst;
}
