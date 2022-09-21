package io.codelex.classesandobjects.practice.fuelgage;

public class FuelGauge {

    double maxLiters = 70;
    double currentLiters;

   public FuelGauge(){}
    public FuelGauge(double currentLiters) {
        maxLiters = currentLiters;

    }

    public double getCurrentLiters() {
        return currentLiters;
    }

    public void incrementLiter() {
        if (currentLiters < 70) {
            currentLiters++;
        }
    }

    public void decrementLiter() {
        if (currentLiters > 0) {
            currentLiters--;
        }
    }
}
