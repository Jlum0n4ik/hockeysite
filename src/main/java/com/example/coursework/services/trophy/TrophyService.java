package com.example.coursework.services.trophy;

import com.example.coursework.models.trophy.Trophy;
import com.example.coursework.repositories.trophy.TrophyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrophyService {
    private TrophyRepository trophyRepository;
    public List<Trophy> findAllTrophies() {
        return trophyRepository.findAll();
    }
}
