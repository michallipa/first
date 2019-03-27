package data;

public class Calc {
    public double calculate(double a,String operator,double b){
        double result = 0;

        switch(operator){
            case "+":
                result = a + b;
            break;
            case "-":
                result = a - b;
            break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Podany operator nie istnieje! ");
        }
        return result;
    }
}
