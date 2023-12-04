package com.example.coursework.models.trophy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "trophies")
public class Trophy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String photo_url;
}
