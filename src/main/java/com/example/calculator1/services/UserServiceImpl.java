package com.example.calculator1.services;

import com.example.calculator1.dto.UserDto;
import com.example.calculator1.dto.UserForm;
import com.example.calculator1.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDto getUser(String email) {
        return usersRepository.findByEmail(email)
                .map(UserDto::from)
                .orElseThrow(() -> new NoSuchElementException("User not found with email: " + email));
    }
}
