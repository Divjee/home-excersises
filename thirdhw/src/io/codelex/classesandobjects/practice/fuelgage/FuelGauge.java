package io.codelex.classesandobjects.practice.fuelgage;

public class FuelGauge {

    private double maxLiters = 70;
    private double currentLiters;

   public FuelGauge(){}
    public FuelGauge(double currentLiters) {
        this.maxLiters = currentLiters;

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
    public double getMaxLiters() {
        return maxLiters;
    }
}
