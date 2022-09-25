package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your desired sum");

        int desiredSum = input.nextInt();

        int dice1 = diceRoll();
        int dice2 = diceRoll();

        if (desiredSum <= 12 && desiredSum > 1) {
            if (desiredSum != dice1 + dice2) {
                do {
                    dice1 = diceRoll();
                    dice2 = diceRoll();
                    System.out.println(dice1 + " and " + dice2 + " = " + (dice1 + dice2));
                } while (dice1 + dice2 != desiredSum);
            }
        } else {
            System.out.println("The sum you entered is not reachable by two six-sided dices");
        }
    }

    private static int diceRoll() {
        Random randomNum = new Random();
        return randomNum.nextInt(6) + 1;
    }
}
