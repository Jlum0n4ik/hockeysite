package com.example.coursework.controllers;

import com.example.coursework.services.trophy.TrophyService;
import com.example.coursework.web.dto.trophy.TrophyDTO;
import com.example.coursework.web.mappers.TrophyMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TrophyController {
    private TrophyService trophyService;
    private TrophyMapper trophyMapper;
    @GetMapping("/trophies")
    public ResponseEntity<List<TrophyDTO>> allTrophies() {
        var trophies = trophyMapper.fromTrophyList(trophyService.findAllTrophies());
        if(trophies == null || trophies.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(trophies, HttpStatus.OK);
    }
}
