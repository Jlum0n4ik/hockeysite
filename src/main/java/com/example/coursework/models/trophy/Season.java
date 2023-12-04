package com.example.coursework.models.trophy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "seasons")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
}
