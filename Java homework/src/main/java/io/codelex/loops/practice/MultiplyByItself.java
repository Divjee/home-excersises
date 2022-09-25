package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int multiplier;
        for (int i = 1; i <= n; i++) {
            multiplier = i * n;
            System.out.println(multiplier);
        }
    }
}
