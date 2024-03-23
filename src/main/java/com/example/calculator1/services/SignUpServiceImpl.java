package com.example.calculator1.services;

import com.example.calculator1.dto.UserForm;
import com.example.calculator1.models.Role;
import com.example.calculator1.models.User;
import com.example.calculator1.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SignUpServiceImpl implements SignUpService{

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void addUser(UserForm form) {
        User user = User.builder()
                .email(form.getEmail())
                .firstname(form.getFirstname())
                .surname(form.getSurname())
                .password(passwordEncoder.encode(form.getPassword()))
                .confirmed("CONFIRMED")
                .role(Role.ADMIN)
                .build();
        userRepository.save(user);
    }
}