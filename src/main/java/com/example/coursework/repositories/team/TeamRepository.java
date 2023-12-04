package com.example.coursework.repositories.team;

import com.example.coursework.models.team.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {
    Optional<Team> findTeamByName(String name);
}
