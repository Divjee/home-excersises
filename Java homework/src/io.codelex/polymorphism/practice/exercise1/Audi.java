package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car{
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed -= 2;
    }

    public String showCurrentSpeed() {
        return "Audis current speed is: "+ currentSpeed.toString();
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        System.out.println("Audi goes eugeueheueueu.....");
    }
}
