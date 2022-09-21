package io.codelex.classesandobjects.practice.car;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {

        double startKilometers;
        double endKilometers;
        double liters;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter KM you started at: ");
        startKilometers = scan.nextDouble();

        Car car = new Car(startKilometers);

        System.out.print("Enter your KM you ended at: ");
        endKilometers = scan.nextDouble();
        System.out.print("Enter the amount of liters did the car consume?");
        liters = scan.nextDouble();
        car.fillUp(endKilometers, liters);

        System.out.println("Kilometers per liter are " + car.calculateConsumption() + " .");

        System.out.print("Enter your KM you ended at: ");
        endKilometers = scan.nextDouble();
        System.out.print("Enter the amount of liters did the car consume?");
        liters = scan.nextDouble();
        car.fillUp(endKilometers, liters);

        System.out.println("Kilometers per liter are " + car.calculateConsumption() + " .");

        if (car.gasHog()) {
            System.out.println("Greta hates your car");
        } else if (car.economyCar()) {
        }

    }
}

