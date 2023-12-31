package com.example.coursework.services.player;

import com.example.coursework.models.player.SkaterStats;
import com.example.coursework.repositories.player.SkaterStatsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SkaterStatsService {
    private SkaterStatsRepository skaterStatsRepository;
    public List<SkaterStats> getAllSkaterStats() {
        return skaterStatsRepository.findAll();
    }
}
