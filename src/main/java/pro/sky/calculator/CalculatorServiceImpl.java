package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(String num1, String num2) {
        if (checkNull(num1, num2)) {
            return "Ошибка";
        }
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + sum;
    }

    @Override
    public String subtraction(String num1, String num2) {
        if (checkNull(num1, num2)) {
            return "Ошибка";
        }
        int sum = Integer.parseInt(num1) - Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + sum;
    }

    @Override
    public String multiply(String num1, String num2) {
        if (checkNull(num1, num2)) {
            return "Ошибка";
        }
        int sum = Integer.parseInt(num1) * Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + sum;
    }

    @Override
    public String divide(String num1, String num2) {
        if (checkNull(num1, num2)) {
            return "Ошибка";
        } else if (Integer.parseInt(num2) == 0) {
            return "Делить на 0 нельзя";
        }
        double sum = (double) Integer.parseInt(num1) / (double) Integer.parseInt(num2);
        return num1 + " / " + num2 + " = " + sum;
    }

    @Override
    public boolean checkNull(String num1, String num2) {
        if (num1.isBlank() || num2.isBlank()) {
            return true;
        }
        return false;
    }

}
