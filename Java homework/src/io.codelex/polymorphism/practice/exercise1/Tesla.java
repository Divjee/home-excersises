package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 18;
    }

    public void slowDown() {
        currentSpeed -= 9;
    }

    public String showCurrentSpeed() {
        return "Teslas current speed is: "+ currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("-- Tesla goes psssssssssss ---");
    }

    public void batteryDied(){
        currentSpeed = 0;
        System.out.println("Teslas battery died");
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
