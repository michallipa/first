package app;
import java.util.Scanner;
import java.util.Locale;
import data.Calc;

public class InOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Calc calc = new Calc();

        System.out.println("Podaj pierwszą liczbę: ");
        int a = input.nextInt();
        input.nextLine();
        System.out.println("Podaj operator: ");
        String operator = input.nextLine();
        System.out.println("Podaj drugą liczbę; ");
        int b = input.nextInt();
        input.close();

        double result = calc.calculate(a,operator,b);
        System.out.println(a + operator + b + " = " + result);




    }
}
