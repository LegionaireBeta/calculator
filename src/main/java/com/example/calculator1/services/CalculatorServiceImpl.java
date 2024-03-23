package com.example.calculator1.services;

import com.example.calculator1.dto.OperationForm;
import com.example.calculator1.models.Operation;
import com.example.calculator1.models.User;
import com.example.calculator1.repositories.OperationRepository;
import com.example.calculator1.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceImpl implements CalculatorService{

    @Autowired
    private OperationRepository operationRepository;

    @Autowired
    private UsersRepository usersRepository;



    @Override
    public void calculate(OperationForm form) {
        double result = 0;
        String[] tokens = form.getOperation().split(" ");

        if (tokens[0].equals("√")) {

            double operand = Double.parseDouble(tokens[1]);
            result = Math.sqrt(operand);

        } else if (tokens.length == 3) {
            double operand1 = Double.parseDouble(tokens[0]);
            double operand2 = Double.parseDouble(tokens[2]);
            switch (tokens[1].charAt(0)) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 != 0) {
                        result = operand1 / operand2;
                    } else {
                        result = Double.NaN;
                    }
                    break;
                case '^':
                    result = Math.pow(operand1, 2);
                    break;
                default:
                    result = Double.NaN;
            }
        }

        User user = usersRepository.findById(form.getUserId())
                .orElseThrow(() -> new RuntimeException("user not found"));

        String strResult = Double.toString(result);
        Operation operation = Operation.builder()
                .operation(form.getOperation())
                .result(strResult)
                .user(user)
                .build();
        operationRepository.save(operation);
    }

    @Override
    public String lastCalculation() {
        Operation operation = operationRepository.findTopByOrderByOperationIdDesc()
                .orElseThrow(() -> new RuntimeException("answer doesnt found"));

        return operation.getResult();
    }
}
