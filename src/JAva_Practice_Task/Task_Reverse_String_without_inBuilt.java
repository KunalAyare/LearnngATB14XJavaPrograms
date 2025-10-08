package JAva_Practice_Task;

import java.util.Scanner;

public class Task_Reverse_String_without_inBuilt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String here");
        String reversed = sc.nextLine();

        //rough logic
        //reversed = ABC
        // A, B , C
        //Reverse = CBA

         int i =reversed.length()-1;
        while (i>=0){
            System.out.print(reversed.charAt(i));
            i--;

        }
    }
}



