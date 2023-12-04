package com.example.coursework.repositories.game;

import com.example.coursework.models.game.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {
}
