package JAva_Practice_Task;

import java.util.Scanner;

public class PrintNumbersUsingForLoop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (i > 1) sb.append(' ');
            sb.append(i);
        }
        System.out.println(sb.toString());

        sc.close();
    }
}

