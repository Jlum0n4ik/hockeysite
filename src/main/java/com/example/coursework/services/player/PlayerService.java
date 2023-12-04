package com.example.coursework.services.player;

import com.example.coursework.models.player.Player;
import com.example.coursework.repositories.player.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private PlayerRepository playerRepository;
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
