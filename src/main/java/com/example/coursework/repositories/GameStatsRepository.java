package com.example.coursework.repositories;

import com.example.coursework.models.game.GameStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameStatsRepository extends JpaRepository<GameStats, Long> {
}
