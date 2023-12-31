package com.example.coursework.services.game;

import com.example.coursework.models.game.Game;
import com.example.coursework.repositories.game.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {
    private GameRepository gameRepository;
    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }
}
