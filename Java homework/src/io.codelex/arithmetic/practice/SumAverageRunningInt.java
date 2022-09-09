package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        double sum = 0;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        System.out.println("The sum of " + lowerBound+ " to " + upperBound +" is " + sum);

        double calculateAverage = sum/upperBound;

        System.out.println("The average is " + calculateAverage);
    }
}
