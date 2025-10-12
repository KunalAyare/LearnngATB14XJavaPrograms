package JAva_Practice_Task;

import java.util.Scanner;

public class LargestOfThree7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        if (a == b && b == c) {
            System.out.println("All numbers are equal: " + a);
        } else {
            System.out.println("Largest number is: " + largest);
        }

        sc.close();
    }
}
