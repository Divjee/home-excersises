package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) throws InterruptedException {
        Bmw bmwe46 = new Bmw();
        Lexus lexus = new Lexus();
        Audi audi = new Audi();
        Tesla tesla = new Tesla();
        Zurka zurka = new Zurka();
        Zigulis zigulis = new Zigulis();
        Car car = null;

        List<Car> cars = new ArrayList<>();
        cars.add(bmwe46);
        cars.add(lexus);
        cars.add(tesla);
        cars.add(zurka);
        cars.add(zigulis);
        cars.add(audi);

        for (int i = 3; i > 0; i--) {
            System.out.println("Race is about to begin in: " + i);
            Thread.sleep(1000);
            if (i == 1) {
                System.out.println("\t\t\tGO!");
            }
        }

        int maxSpeed = 0;
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).startEngine();
            Thread.sleep(1000);
            for (int j = 0; j < 10; j++) {
                cars.get(i).speedUp();
                if (j == 2 || j == 6) {
                    System.out.println("Sharp Turn!! Slow down");
                    cars.get(i).slowDown();
                    cars.get(i).slowDown();
                }
                if (j == 3 && cars.get(i).equals(bmwe46)) {
                    bmwe46.useNitrousOxideEngine();
                } else if (j == 3 && cars.get(i).equals(lexus)) {
                    lexus.useNitrousOxideEngine();
                }
                System.out.println(cars.get(i).showCurrentSpeed());
                Thread.sleep(150);
                if (j == 9 && cars.get(i).equals(tesla)) {
                    tesla.batteryDied();
                    System.out.println(cars.get(i).showCurrentSpeed());
                } else if (j == 9 && cars.get(i).equals(zurka)) {
                    zurka.brokeDown();
                    System.out.println(cars.get(i).showCurrentSpeed());
                }
            }
            if (cars.get(i).getCurrentSpeed() > maxSpeed) {
                maxSpeed = cars.get(i).getCurrentSpeed();
                car = cars.get(i);
            }
            if (i == cars.size() - 1) {
                System.out.println(car.getClass().getSimpleName().toUpperCase() + " WAS THE FASTEST!!");
            }
        }
    }
}




