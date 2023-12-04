package com.example.coursework.controllers;

import com.example.coursework.services.game.GameService;
import com.example.coursework.services.game.GameStatsService;
import com.example.coursework.web.dto.game.GameDTO;
import com.example.coursework.web.dto.game.GameStatsDTO;
import com.example.coursework.web.mappers.GameMapper;
import com.example.coursework.web.mappers.GameStatsMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GameController {
    private GameService gameService;
    private GameMapper gameMapper;

    private GameStatsService gameStatsService;
    private GameStatsMapper gameStatsMapper;
    @GetMapping("/games")
    public ResponseEntity<List<GameDTO>> allGames() {
        var games = gameMapper.fromListGames(gameService.findAllGames());
        if(games == null || games.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(games, HttpStatus.OK);
    }
    @GetMapping("/gameStats")
    public ResponseEntity<List<GameStatsDTO>> allGameStats() {
        var gameStats = gameStatsMapper.fromGameStatsList(gameStatsService.getAllGameStats());
        if(gameStats == null || gameStats.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(gameStats, HttpStatus.OK);
    }
}
