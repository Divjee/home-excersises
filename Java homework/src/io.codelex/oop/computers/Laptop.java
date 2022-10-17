package io.codelex.oop.computers;

public class Laptop extends Computer {
    private double batteryLife;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, double batteryLife) {
        super(processor, ram, graphicsCard, company, model);
        this.batteryLife = batteryLife;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void chargeBattery() {
        if (batteryLife < 100) {
            double fullCharge = 100;
            double addPercent = fullCharge - batteryLife;
            batteryLife += addPercent;
        }
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryLife=" + batteryLife +
                ", processor='" + getProcessor() + '\'' +
                ", ram=" + getRam() +
                ", graphicsCard='" + getGraphicsCard() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
