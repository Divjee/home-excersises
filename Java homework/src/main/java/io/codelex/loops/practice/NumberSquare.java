package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the min number:");
        int min = input.nextInt();
        System.out.println("Enter the max number:");
        int max = input.nextInt();

        for(int i = min; i <= max; i++) {
            for(int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for(int k = 0; k < i - min; k++) {
                System.out.print(min + k);
            }
            System.out.println();

        }


    }
}


