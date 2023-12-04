package com.example.coursework.controllers;

import com.example.coursework.services.team.TeamService;
import com.example.coursework.services.team.TeamStatsService;
import com.example.coursework.web.dto.team.TeamDTO;
import com.example.coursework.web.dto.team.TeamStatsDTO;
import com.example.coursework.web.mappers.TeamMapper;
import com.example.coursework.web.mappers.TeamStatsMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private TeamService teamService;
    private TeamMapper teamMapper;

    private TeamStatsService teamStatsService;
    private TeamStatsMapper teamStatsMapper;
    @GetMapping("/teams")
    public ResponseEntity<List<TeamDTO>> allTeams() {
        var teams = teamMapper.fromListTeams(teamService.findAllTeams());
        if(teams == null || teams.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(teams, HttpStatus.OK);
    }
    @GetMapping("/teamsStats")
    public ResponseEntity<List<TeamStatsDTO>> allTeamsStats() {
        var teamsStats = teamStatsMapper.fromTeamStatsList(teamStatsService.getAllTeamStats());
        if(teamsStats == null || teamsStats.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(teamsStats, HttpStatus.OK);
    }
}
