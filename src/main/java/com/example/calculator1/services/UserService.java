package com.example.calculator1.services;

import com.example.calculator1.dto.UserDto;
import com.example.calculator1.dto.UserForm;

public interface UserService {
    UserDto getUser(String email);
}
