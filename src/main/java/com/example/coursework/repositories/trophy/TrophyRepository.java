package com.example.coursework.repositories.trophy;

import com.example.coursework.models.trophy.Trophy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrophyRepository extends JpaRepository<Trophy, Long> {
    Optional<Trophy> findTrophyByName(String name);
}
