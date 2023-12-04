package com.example.coursework.web.dto.team;

import com.example.coursework.models.team.Country;
import lombok.Data;

import java.sql.Date;

@Data
public class TeamDTO {
    private int id;
    private String name;
    private Country country;
    private Date found_date;
}
