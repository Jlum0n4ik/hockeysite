package com.example.coursework.models.player;

import com.example.coursework.models.game.Game;
import com.example.coursework.models.team.Team;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;

@Data
@Entity
@Table(name = "player_stats")
public class PlayerStats {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    private Team team;
    @ManyToOne
    private Player player;
    @Column(name = "total_ice_time")
    private Time icetime;
    @OneToOne
    private Game game;
}
