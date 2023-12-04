package com.example.coursework.repositories;

import com.example.coursework.models.player.GoalieStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalieStatsRepository extends JpaRepository<GoalieStats, Long> {
}
