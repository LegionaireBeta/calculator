package com.example.calculator1.controllers;

import com.example.calculator1.dto.UserForm;
import com.example.calculator1.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage(){
        return "sign_up_page";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm form){
        System.out.println(form.toString());
        signUpService.addUser(form);
        return "redirect:/signUp";
    }

}

