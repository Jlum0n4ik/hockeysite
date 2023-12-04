package com.example.coursework.repositories.team;

import com.example.coursework.models.team.TeamStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamStatsRepository extends JpaRepository<TeamStats, Long> {
}
