package com.example.coursework.services;

import com.example.coursework.models.trophy.Trophy;
import com.example.coursework.repositories.TrophyRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
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
