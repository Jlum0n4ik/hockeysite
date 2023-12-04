package com.example.coursework.models.team;

import com.example.coursework.models.player.Player;
import com.example.coursework.models.trophy.Season;
import com.example.coursework.models.trophy.Trophy;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Map;

@Data
@Entity
@Table(name = "teams")
@SecondaryTables(
        @SecondaryTable(name = "countries",
                pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))

)
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    @Column(name = "name", table = "countries")
    @Enumerated(EnumType.STRING)
    private Country country;
    private Date found_date;
    @ManyToMany
    @JoinTable(name = "Teams_Seasons_Trophies",
               joinColumns = @JoinColumn(name = "team_id"),
               inverseJoinColumns = @JoinColumn(name = "trophy_id"))
    @MapKeyJoinColumn(name = "season_id")
    private Map<Season, Trophy> trophyList;
    @ManyToMany
    @JoinTable(name = "Player_Team_Season",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id"))
    @MapKeyJoinColumn(name = "season_id")
    private Map<Season, Player> playersList;

}
