package io.codelex.classesandobjects.practice.car;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;
    double mileage;


    public Car(double startOdo) {
        this.startKilometers = startOdo;
        this.endKilometers = startOdo;
        this.liters = 0;

    }

    public void fillUp(double mileage, double liters) {
        this.liters = liters;
        this.endKilometers = mileage;

    }

    public double calculateConsumption() {
        return Math.round((liters / (endKilometers - startKilometers) * 100) * 100) / 100.0;
    }

    boolean gasHog() {
        return calculateConsumption() >= 15;
        }

    boolean economyCar() {
        return calculateConsumption() < 5;
    }
}