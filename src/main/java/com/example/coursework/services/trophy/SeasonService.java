package com.example.coursework.services.trophy;

import com.example.coursework.models.trophy.Season;
import com.example.coursework.repositories.trophy.SeasonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SeasonService {
    private SeasonRepository seasonRepository;
    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }
}
