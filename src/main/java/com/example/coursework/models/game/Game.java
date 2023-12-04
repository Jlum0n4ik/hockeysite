package com.example.coursework.models.game;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.sql.Date;

@Data
@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "game_date")
    private Date date;
    @Column(name = "game_time")
    private Time time;
    @Column(name = "game_attendance")
    private int attendance;
    @Column(name = "game_status")
    @Enumerated(EnumType.STRING)
    private GameStatus gameStatus;
}
