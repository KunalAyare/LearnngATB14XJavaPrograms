package JAva_Practice_Task;

import java.util.Scanner;

public class SimpleCalculatorSwitch10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();   // first number
        char op = sc.next().charAt(0); // operator: + - * /
        double b = sc.nextDouble();   // second number

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operator. Use +, -, *, /");
        }

        sc.close();
    }
}
