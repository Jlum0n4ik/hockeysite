package com.example.coursework.web.mappers;

import com.example.coursework.models.player.GoalieStats;
import com.example.coursework.web.dto.player.GoalieStatsDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GoalieStatsMapper {
    GoalieStatsDTO fromGoalieStats(GoalieStats goalieStats);
    GoalieStats fromGoalieStatsDTO(GoalieStatsDTO goalieStatsDTO);
    List<GoalieStatsDTO> fromListGoalieStats(List<GoalieStats> goalieStats);
}
