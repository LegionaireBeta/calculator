package com.example.calculator1.services;

import com.example.calculator1.dto.OperationForm;

public interface CalculatorService {

    void calculate(OperationForm form);

    String lastCalculation();
}
