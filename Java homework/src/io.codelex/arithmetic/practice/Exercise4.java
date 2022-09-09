package io.codelex.arithmetic.practice;

public class Exercise4 {
    public static void main(String[] args) {

        int lowerBound = 1;
        int upperBound = 10;

        for(int i = lowerBound; i <= upperBound ; i++){
            lowerBound *= i;
        }
        System.out.println(lowerBound);

    }
}
