package com.example.coursework.web.mappers;

import com.example.coursework.models.player.Player;
import com.example.coursework.web.dto.player.PlayerDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    PlayerDTO fromPlayer(Player player);
    Player fromPlayerDTO(PlayerDTO playerDTO);
    List<PlayerDTO> fromPlayersList(List<Player> playerList);
}
