package io.codelex.arithmetic.practice;

public class Exercise9 {
    public static void main(String[] args) {
        bmiIndex(75, 177);

    }

    public static void bmiIndex(double weight, double height) {
        double weightInLbs = weight * 2.2;
        double heightInInches = height / 2.54;

        double bodyMassIndex = (weightInLbs * 703) / Math.pow(heightInInches, 2);

        if (bodyMassIndex < 18.5) {
            System.out.println("You are underweight" + String.format("%.2f", bodyMassIndex));
        } else if (bodyMassIndex > 25) {
            System.out.println("You are overweight " + String.format("%.2f", bodyMassIndex));
        } else {
            System.out.println("Your body mass index is good " + String.format("%.2f", bodyMassIndex));

        }
    }
}
