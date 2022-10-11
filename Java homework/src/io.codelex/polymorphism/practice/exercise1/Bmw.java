package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car, FasterCars {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed -= 5;
    }

    public String showCurrentSpeed() {
        return "BMW's current speed is: "+ currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("BMW goes Tututututut.....");
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed+  37;
    }

}
