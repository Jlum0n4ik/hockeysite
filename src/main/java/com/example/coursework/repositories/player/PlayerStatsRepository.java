package com.example.coursework.repositories.player;

import com.example.coursework.models.player.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Long> {
}
