package io.codelex.loops;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = input.nextLine();

        System.out.println("Enter your second word");
        String secondWord = input.nextLine();

        String dot = ".";
        int lineLength = 30;

        int i = 0;
        String combined = firstWord + secondWord;
        if (combined.length() < lineLength) {

            while (combined.length() < lineLength) {
                combined = firstWord + (dot.repeat(i)) + secondWord;
                i++;
            }
            System.out.println(combined);
        } else {
            System.out.println("Combined word length can't be more or equal to 30");
        }
    }

}