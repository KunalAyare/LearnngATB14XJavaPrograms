package ex_13_Functions;

import java.util.Scanner;

public class Lab131_User_define {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();


        int result = sum_of_two(a,b);
        int result1 = sum_of_two(444,533);
        int result2 = sum_of_two(444555,55533);


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);



    }
    static int sum_of_two(int a, int b){
        return a+b;
    }
}
