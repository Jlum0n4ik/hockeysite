package com.example.coursework.controllers;

import com.example.coursework.services.player.PlayerStatsService;
import com.example.coursework.web.dto.player.PlayerStatsDTO;
import com.example.coursework.web.mappers.PlayerStatsMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestUserController {
    private PlayerStatsService playerStatsService;
    private PlayerStatsMapper playerStatsMapper;
    @GetMapping("/playerStats")
    public ResponseEntity<List<PlayerStatsDTO>> allPlayerStats() {
        var playerStats = playerStatsMapper.fromPlayerStatsList(playerStatsService.getAllPlayerStats());
        if(playerStats == null || playerStats.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(playerStats, HttpStatus.OK);
    }
}
