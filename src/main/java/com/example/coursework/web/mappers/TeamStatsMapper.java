package com.example.coursework.web.mappers;

import com.example.coursework.models.team.TeamStats;
import com.example.coursework.web.dto.team.TeamStatsDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamStatsMapper {
    TeamStatsDTO fromTeamStats(TeamStats teamStats);
    TeamStats fromTeamStatsDTO(TeamStatsDTO teamStatsDTO);
    List<TeamStatsDTO> fromTeamStatsList(List<TeamStats> teamStatsList);
}
