package io.codelex.typesandvariables.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        long sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your numbers");
        long numbers = input.nextLong();

        while (numbers > 0) {
            sum = sum + (numbers % 10);
            numbers = numbers / 10;

        }
        System.out.println(sum);
    }
}
