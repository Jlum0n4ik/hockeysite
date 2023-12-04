package com.example.coursework.services.player;

import com.example.coursework.models.player.PlayerStats;
import com.example.coursework.repositories.player.PlayerStatsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerStatsService {
    private PlayerStatsRepository playerStatsRepository;
    public List<PlayerStats> getAllPlayerStats() {
        return playerStatsRepository.findAll();
    }
}
