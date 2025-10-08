package JAva_Practice_Task;

import java.util.Scanner;

public class Count_Number_Words_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String here");
        String b = sc.nextLine();

        //  words how i can find words

        String[] words = b.split("[\s]+");
        System.out.println(words.length);












    }
}
