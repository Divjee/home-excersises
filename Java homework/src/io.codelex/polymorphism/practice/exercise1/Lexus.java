package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, FasterCars{
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed -= 1;
    }

    public String showCurrentSpeed() {
        return "Lexus current speed is: "+  currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 33;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        System.out.println("Lexus goes brrrrrrrrrr.....");
    }
}
