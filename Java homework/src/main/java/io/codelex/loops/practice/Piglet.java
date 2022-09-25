package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {


    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int yourScore = 0;
        System.out.println("Welcome to PIGLET!");
        while (1 != 0) {
            int dice = diceRoll();

            System.out.printf("You rolled a %d .\n", dice);

            if (dice == 1) {
                System.out.println("You got 0 points!");
                break;
            }
            yourScore += dice;

            System.out.println("Roll again? (Yes/No)");
            char yourChoice = input.next().charAt(0);
            if (Character.toLowerCase(yourChoice) == 'n') {
                System.out.printf("You got %d points! \n", yourScore);
                break;
            }
        }
    }

    private static int diceRoll() {
        Random randomNum = new Random();
        return randomNum.nextInt(6) + 1;
    }

}