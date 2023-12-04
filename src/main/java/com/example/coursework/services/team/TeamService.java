package com.example.coursework.services.team;

import com.example.coursework.models.team.Team;
import com.example.coursework.repositories.team.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository teamRepository;
    public List<Team> findAllTeams() {
        return teamRepository.findAll();
    }
}
