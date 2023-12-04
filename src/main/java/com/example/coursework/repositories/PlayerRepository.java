package com.example.coursework.repositories;

import com.example.coursework.models.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Optional<Player> findPlayerByfname(String f_name);
}
