package io.codelex.classesandobjects.practice.fuelgage;

public class Car {
    public static void main(String[] args) {

        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(300, fuelGauge);

        for (int i = 0; i < fuelGauge.getMaxLiters(); i++) {
            fuelGauge.incrementLiter();
        }

        while (fuelGauge.getCurrentLiters() > 0) {
            odometer.incrementKm();
            System.out.println("Mileage: " + odometer.getCarCurrentMileage() +
                    "\n Fuel level: " + fuelGauge.getCurrentLiters());
        }
    }
}