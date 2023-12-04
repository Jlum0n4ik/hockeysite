package com.example.coursework.web.mappers;

import com.example.coursework.models.player.SkaterStats;
import com.example.coursework.web.dto.player.SkaterStatsDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SkaterStatsMapper {
    SkaterStatsDTO fromSkaterStats(SkaterStats skaterStats);
    SkaterStats fromSkaterStatsDTO(SkaterStatsDTO skaterStatsDTO);
    List<SkaterStatsDTO> fromListSkaterStats(List<SkaterStats> skaterStatslist);
}
