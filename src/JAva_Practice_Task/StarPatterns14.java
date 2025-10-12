package JAva_Practice_Task;

import java.util.Scanner;

public class StarPatterns14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println("Right Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pyramid:");
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            // stars
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}
