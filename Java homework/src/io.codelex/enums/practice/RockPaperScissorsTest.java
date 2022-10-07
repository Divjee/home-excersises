package io.codelex.enums.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Lets begin......");
        int winTimes = 0;
        int loses = 0;
        while (true) {
            System.out.println("\nYour turn (Enter s for scissor, p for paper, t for stone, q to quit)");
            RockPaperScissors userChoice = RockPaperScissors.getTheMove(scanner.next().charAt(0));
            if (userChoice == null) {
                System.out.println("WRONG INPUT, ENTER THE GIVEN CHARACTERS!!");
                System.out.println("Enter s for scissor, p for paper, t for stone, q to quit)");
                userChoice = RockPaperScissors.getTheMove(scanner.next().charAt(0));
            }
            System.out.println("Your move: " + userChoice);
            Random r = new Random();
            RockPaperScissors pcChoice = RockPaperScissors.getRpsByInt(r.nextInt(3));
            System.out.println("PC chose: " + pcChoice);
            if (userChoice == RockPaperScissors.QUIT) {
                System.out.println("\nThanks for playing!" + " You won " + winTimes + " time(s) and lost " + loses + " time(s)");
                break;
            }
            if (userChoice == pcChoice) {
                System.out.println("\nIt's a draw");
            } else if (userChoice == RockPaperScissors.SCISSORS && pcChoice == RockPaperScissors.PAPER) {
                System.out.println("\nScissors cut paper! You win");
                winTimes++;
            } else if (userChoice == RockPaperScissors.ROCK && pcChoice == RockPaperScissors.SCISSORS) {
                System.out.println("\nYou rock");
                winTimes++;
            } else if (userChoice == RockPaperScissors.PAPER && pcChoice == RockPaperScissors.ROCK) {
                System.out.println("\nPaper wraps rock!!");
                winTimes++;
            } else {
                System.out.println("\nYou dont rock");
                loses++;
            }

        }
    }
}
