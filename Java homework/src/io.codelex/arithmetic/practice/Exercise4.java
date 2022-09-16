package io.codelex.arithmetic.practice;

public class Exercise4 {
    public static void main(String[] args) {

        int lowerBound = 1;
        int upperBound = 10;
        int product = lowerBound;
        for (int i = lowerBound; i <= upperBound; i++) {
            product *= i;

        }
        System.out.println(product);

    }
}
