package JAva_Practice_Task;

import java.util.Scanner;

public class Number_Even_Odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        while (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num%2 ==0)
            {
                System.out.println(num + " " +"Number is EVEN");
                break;
            }else {
                System.out.println(num + " " +"Number is ODD");
                break;
            }

        }
    }
}