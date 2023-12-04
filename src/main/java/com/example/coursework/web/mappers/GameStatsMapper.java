package com.example.coursework.web.mappers;

import com.example.coursework.models.game.GameStats;
import com.example.coursework.web.dto.game.GameStatsDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GameStatsMapper {
    GameStatsDTO fromGameStats(GameStats gameStats);
    GameStats fromGameStatsDTO(GameStatsDTO gameStatsDTO);
    List<GameStatsDTO> fromGameStatsList(List<GameStats> list);
}
