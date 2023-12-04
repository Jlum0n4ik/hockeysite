package com.example.coursework.repositories;

import com.example.coursework.models.player.SkaterStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkaterStatsRepository extends JpaRepository<SkaterStats, Long> {
}
