package com.example.coursework.repositories.game;

import com.example.coursework.models.game.GameStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameStatsRepository extends JpaRepository<GameStats, Long> {
}
