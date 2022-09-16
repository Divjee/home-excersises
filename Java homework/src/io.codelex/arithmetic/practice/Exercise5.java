package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        double randomNumber = Math.random() * 100;
        int randNum = (int) randomNumber + 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int yourNumber = input.nextInt();

        if (yourNumber > randNum) {
            System.out.println("Your number is too high, the correct number is " + randNum);

        } else if (yourNumber < randNum) {
            System.out.println("Your number is too low, the correct number is " + randNum);
        } else if (yourNumber == randNum) {
            System.out.println("What are the ODDS! You guessed it");
        }
    }


}


