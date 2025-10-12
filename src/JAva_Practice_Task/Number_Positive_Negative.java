package JAva_Practice_Task;

import java.util.Scanner;

public class Number_Positive_Negative {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println(a);

            if (a > 0) {
                System.out.println(a + "Number is positive:");
            } else if (a < 0) {
                System.out.println(a + "Number is negative:");
            } else {
                System.out.println(a + "Number is Zero:");
            }
        }

    }
}