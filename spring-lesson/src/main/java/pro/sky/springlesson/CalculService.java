package pro.sky.springlesson;

import org.springframework.stereotype.Service;


@Service
public class CalculService implements CalculatorService{
public String hello(){
    return "Добро пожаловать в калькулятор";
}
    public String plus(int num1, int num2) {
    return num1 + " + " + num2 + " = " + (num1+num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    public String divide(double num1, double num2) {
    if (num2 == 0){
        return "ALARM DIVIDE on 0, NE TUPI";
    }else return num1 + " / " + num2 + " = " + (num1/num2);

    }

}
