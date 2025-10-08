package JAva_Practice_Task;

import java.util.Scanner;

public class calculates_Grade {

    //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
    //
    //A: 90-100
    //
    //B: 80-89
    //
    //C: 70-79
    //
    //D: 60-69
    //
    //F: 0-59
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Marks");
        float score = scanner.nextFloat();
        System.out.println(score);

        if (score <= 100 && score >= 90) {
            System.out.println("Grade A");
        } else if (score <= 89 && score >= 80) {
            System.out.println("Grade B");
        } else if (score <= 79 && score >= 70) {
            System.out.println("Grade C");
        } else if (score <= 69 && score >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }


    }
}