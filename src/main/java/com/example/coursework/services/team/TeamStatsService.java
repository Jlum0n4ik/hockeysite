package com.example.coursework.services.team;

import com.example.coursework.models.team.TeamStats;
import com.example.coursework.repositories.team.TeamStatsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamStatsService {
    private TeamStatsRepository teamStatsRepository;
    public List<TeamStats> getAllTeamStats() {
        return teamStatsRepository.findAll();
    }
}
