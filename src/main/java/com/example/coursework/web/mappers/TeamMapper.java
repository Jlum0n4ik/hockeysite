package com.example.coursework.web.mappers;

import com.example.coursework.models.team.Team;
import com.example.coursework.web.dto.team.TeamDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {
    TeamDTO fromTeam(Team team);
    Team fromTeamDTO(TeamDTO teamDTO);
    List<TeamDTO> fromListTeams(List<Team> teams);
}
