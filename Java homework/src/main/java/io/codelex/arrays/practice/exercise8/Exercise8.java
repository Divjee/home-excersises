package io.codelex.arrays.practice.exercise8;

import java.util.*;


public class Exercise8 extends Exercise8part2 {
    public static void main(String[] args) {
        Exercise8part2 word = new Exercise8part2();
        Scanner in = new Scanner(System.in);
        String currentWord = word.randomWord();

        int counter = 0;
        while (counter < currentWord.length() + 1) {
            System.out.println("Guess!");
            if (counter == 0) {
                System.out.println("Word: " + "_".repeat(currentWord.length()));
            }
            char letterGuessed = in.nextLine().charAt(0);

            if (Exercise8part2.progress(letterGuessed).equals(currentWord)) {
                System.out.println("Hooray! You guessed it!");
                word = new Exercise8part2();
                currentWord = word.randomWord();
                break;
            }
            counter++;
        }
        if (counter - 1 == currentWord.length()) {
            System.out.println("\nYoure out of guesses");
        }
    }
}











