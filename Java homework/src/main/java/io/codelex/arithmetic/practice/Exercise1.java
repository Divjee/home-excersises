package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(fifteen(3, 4));
    }

    public static boolean fifteen(int a, int b) {
        return a == 15 || a + b == 15 || a - b == 15 || b == 15 || b - a == 15;
    }

}
