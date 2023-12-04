package com.example.coursework.models;

import com.example.coursework.models.user.User;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;

@Data
@Entity
@Table(name = "articles")
@SecondaryTable(name = "users_articles",
                pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String photo_url;
    private String body_url;
    private String header;
    @Column(table = "users_articles")
    private Date creation_date;
    @OneToOne
    @JoinColumn(name = "creator_id", table = "users_articles")
    private User user;
}
