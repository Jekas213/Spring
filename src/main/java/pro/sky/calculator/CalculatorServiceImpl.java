package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String start() {
        return "Старотовая страница";
    }

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String sum(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    @Override
    public String subtraction(int num1, int num2) {
        int sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }

    @Override
    public String multiply(int num1, int num2) {
        int sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        }
        double sum = (double) num1 / (double) num2;
        return num1 + " / " + num2 + " = " + sum;
    }

}
