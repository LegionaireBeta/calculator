package com.example.calculator1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserForm {

    private String email;
    private String firstname;
    private String surname;
    private String password;

}
