package com.example.coursework.controllers;

import com.example.coursework.services.player.GoalieStatsService;
import com.example.coursework.services.player.PlayerService;
import com.example.coursework.services.player.SkaterStatsService;
import com.example.coursework.web.dto.player.GoalieStatsDTO;
import com.example.coursework.web.dto.player.PlayerDTO;
import com.example.coursework.web.dto.player.SkaterStatsDTO;
import com.example.coursework.web.mappers.GoalieStatsMapper;
import com.example.coursework.web.mappers.PlayerMapper;
import com.example.coursework.web.mappers.SkaterStatsMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private PlayerService playerService;
    private PlayerMapper playerMapper;

    private SkaterStatsService skaterStatsService;
    private SkaterStatsMapper skaterStatsMapper;

    private GoalieStatsService goalieStatsService;
    private GoalieStatsMapper goalieStatsMapper;
    @GetMapping("/players")
    public ResponseEntity<List<PlayerDTO>> allPlayers() {
        var players = playerMapper.fromPlayersList(playerService.getAllPlayers());
        if(players == null || players.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    @GetMapping("/skaterStats")
    public ResponseEntity<List<SkaterStatsDTO>> allSkaterStats() {
        var skaterStats = skaterStatsMapper.fromListSkaterStats(skaterStatsService.getAllSkaterStats());
        if(skaterStats == null || skaterStats.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(skaterStats, HttpStatus.OK);
    }
    @GetMapping("/goalieStats")
    public ResponseEntity<List<GoalieStatsDTO>> allGoalieStats() {
        var goalieStats = goalieStatsMapper.fromListGoalieStats(goalieStatsService.getAllGoalieStats());
        if(goalieStats == null || goalieStats.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(goalieStats, HttpStatus.OK);
    }
}
