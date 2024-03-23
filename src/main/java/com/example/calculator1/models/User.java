package com.example.calculator1.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    private String email;
    private String firstname;
    private String surname;
    private String password;

    private String confirmed;
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Operation> operations = new ArrayList<>();


}