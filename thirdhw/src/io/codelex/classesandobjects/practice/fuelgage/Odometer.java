package io.codelex.classesandobjects.practice.fuelgage;

import io.codelex.classesandobjects.practice.fuelgage.FuelGauge;

public class Odometer {

    double carMaxMileage = 999999;

    double carCurrentMileage;
    double kmPerLiter = 10;
    double startingKm;
    FuelGauge fuelGauge;

    public Odometer(double carCurrentMileage, FuelGauge fuelGauge) {
        this.carCurrentMileage = carCurrentMileage;
        this.fuelGauge = fuelGauge;
        this.startingKm = carCurrentMileage;
    }

    public double getCarCurrentMileage() {
        return carCurrentMileage;
    }

    public void incrementKm(){
        if(carCurrentMileage < carMaxMileage){
            carCurrentMileage++;
        }else{
            carCurrentMileage = 0;
            System.out.println("Odometer reset");
        }
        double kMdriven = carCurrentMileage- startingKm;

        if(kMdriven % kmPerLiter == 0){
            fuelGauge.decrementLiter();
        }
    }


}
