package com.example.coursework.web.mappers;

import com.example.coursework.models.trophy.Trophy;
import com.example.coursework.web.dto.trophy.TrophyDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TrophyMapper {
    TrophyDTO fromTrophy(Trophy trophy);
    Trophy fromTrophyDTO(TrophyDTO trophyDTO);
    List<TrophyDTO> fromTrophyList(List<Trophy> trophies);
}
