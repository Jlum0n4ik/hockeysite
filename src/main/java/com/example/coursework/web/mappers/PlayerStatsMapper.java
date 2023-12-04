package com.example.coursework.web.mappers;

import com.example.coursework.models.player.PlayerStats;
import com.example.coursework.web.dto.player.PlayerStatsDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerStatsMapper {
    PlayerStatsDTO fromPlayerStats(PlayerStats playerStats);
    PlayerStats fromPlayerStatsDTO(PlayerStatsDTO playerStatsDTO);
    List<PlayerStatsDTO> fromPlayerStatsList(List<PlayerStats> playerStats);
}
