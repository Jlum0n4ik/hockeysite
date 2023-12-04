package com.example.coursework.models.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
@SecondaryTable(name = "roles",
                pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String f_name;
    private String l_name;
    private String email;
    private String password;
    @Column(name = "name", table = "roles")
    @Enumerated(EnumType.STRING)
    private Role role;
}
