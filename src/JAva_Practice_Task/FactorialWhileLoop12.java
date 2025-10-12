package JAva_Practice_Task;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialWhileLoop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if (n == 0) {
            System.out.println("Factorial: 1");
            return;
        }


        BigInteger fact = BigInteger.ONE;
        int i = 1;
        while (i <= n) {
            fact = fact.multiply(BigInteger.valueOf(i));
            i++;
        }

        System.out.println("Factorial: " + fact.toString());
        sc.close();
    }
}

