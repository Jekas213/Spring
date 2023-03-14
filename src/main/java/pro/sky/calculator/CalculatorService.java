package pro.sky.calculator;

public interface CalculatorService {

    String hello();

    String plus (String num1, String num2);

    String subtraction(String num1, String num2);

    String multiply(String num1, String num2);

    String divide(String num1, String num2);

    boolean checkNull (String num1, String num2);

}
