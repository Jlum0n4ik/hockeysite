package com.example.coursework.models.game;

import com.example.coursework.models.team.Team;
import com.example.coursework.models.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "game_stats")
public class GameStats {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "game_id")
    private long id;
    @OneToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private Game game;
    @OneToOne
    @JoinColumn(name = "game_home_team_stat_id", referencedColumnName = "id")
    private Team homeTeam;
    @OneToOne
    @JoinColumn(name = "game_away_team_stat_id", referencedColumnName = "id")
    private Team awayTeam;
    @ManyToOne
    @JoinColumn(name = "added_by", referencedColumnName = "id")
    private User user;
}
