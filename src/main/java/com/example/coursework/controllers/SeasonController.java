package com.example.coursework.controllers;

import com.example.coursework.services.trophy.SeasonService;
import com.example.coursework.web.dto.trophy.SeasonDTO;
import com.example.coursework.web.mappers.SeasonMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SeasonController {
    private SeasonService seasonService;
    private SeasonMapper seasonMapper;
    @GetMapping("/seasons")
    public ResponseEntity<List<SeasonDTO>> allPlayerStats() {
        var playerStats = seasonMapper.fromListSeason(seasonService.getAllSeasons());
        if(playerStats == null || playerStats.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(playerStats, HttpStatus.OK);
    }
}
