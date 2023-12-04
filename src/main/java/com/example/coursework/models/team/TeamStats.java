package com.example.coursework.models.team;

import com.example.coursework.models.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "team_stats")
public class TeamStats {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "goals_for")
    private int goalsFor;
    @Column(name = "goals_against")
    private int goalsAgainst;
    @Column(name = "pp_attempts")
    private int ppAttempts;
    @Column(name = "pp_goals")
    private int ppGoals;
    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;
    @OneToOne
    @JoinColumn(name = "added_by", referencedColumnName = "id")
    private User user;
}
