package io.codelex.polymorphism.practice.exercise1;

public class Zurka implements Car{

    private Integer currentSpeed = 0;
    @Override
    public void speedUp() {
        currentSpeed += 100;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 15;
    }

    @Override
    public String showCurrentSpeed() {
        return "Zurkas current speed is: "+ currentSpeed.toString();
    }

    public void brokeDown(){
        currentSpeed = 0;
        System.out.println("Zurka broke down");
    }

    @Override
    public void startEngine() {
            System.out.println("brum brum brum");
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
