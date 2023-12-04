package com.example.coursework.services;

import com.example.coursework.models.player.GoalieStats;
import com.example.coursework.repositories.GoalieStatsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GoalieStatsService {
    private GoalieStatsRepository goalieStatsRepository;
    public List<GoalieStats> getAllGoalieStats() {
        return goalieStatsRepository.findAll();
    }
}
