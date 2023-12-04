package com.example.coursework.web.mappers;

import com.example.coursework.models.game.Game;
import com.example.coursework.web.dto.game.GameDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GameMapper {
    GameDTO fromGame(Game game);
    Game fromGameDTO(GameDTO gameDTO);
    List<GameDTO> fromListGames(List<Game> games);
}
