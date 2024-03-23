package com.example.calculator1.controllers;


import com.example.calculator1.dto.OperationForm;
import com.example.calculator1.dto.UserDto;
import com.example.calculator1.services.CalculatorService;
import com.example.calculator1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private UserService userService;

    @GetMapping("/calculate")
    public String getCalculatorPage(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        String userEmail = userDetails.getUsername();
        UserDto userDto = userService.getUser(userEmail);

        model.addAttribute("userName", userDetails.getUsername());
        model.addAttribute("userId", userDto.getId());
        if (!model.containsAttribute("opera")) {
            model.addAttribute("opera", "");
        }
        return "calculator_page";
    }

    @PostMapping("/calculate")
    public String Calculate(OperationForm form, RedirectAttributes redirectAttributes){
        System.out.println(form.toString());
        calculatorService.calculate(form);
        redirectAttributes.addFlashAttribute("opera", calculatorService.lastCalculation());
        return "redirect:/calculate";
    }
}
