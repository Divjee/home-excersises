package io.codelex.polymorphism.practice.exercise1;

public class Zigulis implements Car{
    private Integer currentSpeed = 0;
    @Override
    public void speedUp() {
        currentSpeed += 40;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 20;
    }

    @Override
    public String showCurrentSpeed() {
        return "Zigulis current speed is: "+ currentSpeed.toString();
    }

    @Override
    public void startEngine() {
            System.out.println("rrrrrrrr");
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

}
