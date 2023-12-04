package com.example.coursework.models.player;

import com.example.coursework.models.team.Team;
import com.example.coursework.models.trophy.Season;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Map;

@Data
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private Date date_of_birth;
    @Column(name = "name")
    private String fname;
    @Column(name = "lname")
    private String lname;
    private int age;
    private int weight;
    private int height;
    private String photo_url;
    @Enumerated(EnumType.STRING)
    private Position position;

    /*@ManyToMany(mappedBy = "playersList")
    @MapKeyJoinColumn(name = "season_id")
    private Map<Season, Team> seasonTeamMap;
    * */

}
