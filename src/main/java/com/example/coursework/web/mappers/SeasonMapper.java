package com.example.coursework.web.mappers;

import com.example.coursework.models.trophy.Season;
import com.example.coursework.web.dto.trophy.SeasonDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeasonMapper {
    SeasonDTO fromSeason(Season season);
    Season fromSeasonDTO(SeasonDTO seasonDTO);
    List<SeasonDTO> fromListSeason(List<Season> seasons);
}
