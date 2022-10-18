package io.codelex.classesandobjects.practice.energy;

public class EnergyDrinks {

    public static void main(String[] args) {

        System.out.println("Total number of people surveyed " + Drinker.NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers(Drinker.NUMBERED_SURVEYED) + " bought at least one energy drink");
        System.out.println(calculatePreferCitris(Drinker.NUMBERED_SURVEYED) + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        double energyDrinkers = numberSurveyed * Drinker.PURCHASED_ENERGY_DRINKS;
        return Math.round(energyDrinkers);
    }

    public static double calculatePreferCitris(int numberSurveyed) {
        double preferCitrus = numberSurveyed * Drinker.PREFER_CITRUS_DRINKS;
        return Math.round(preferCitrus);
    }
}
