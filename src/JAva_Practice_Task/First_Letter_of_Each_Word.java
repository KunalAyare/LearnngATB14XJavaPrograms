package JAva_Practice_Task;

import java.util.Scanner;

public class First_Letter_of_Each_Word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String here");
        String b = sc.nextLine();

        //  words how i can find words
        String[] words = b.trim().split("\\s+");

        StringBuilder initials = new StringBuilder();
        for(String fl : words){
            if (!fl.isEmpty()) {
                initials.append(fl.charAt(0)); // first letter of each word [web:55]
            }
        }
        System.out.println(initials.toString());

    }
}
