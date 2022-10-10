package io.codelex.polymorphism.practice.exercise1;

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

        for (int i = 3; i > 0; i--) {
            System.out.println("Race is about to begin in: " + i);
            Thread.sleep(2000);
            if (i == 1) {
                System.out.println("\t\t\tGO!");
            }
        }
        Thread.sleep(2000);
        bmwe46.startEngine();
        lexus.startEngine();
        audi.startEngine();
        tesla.startEngine();

        System.out.println();

        int lap = 1;
        for (int i = 0; i <= 3; i++) {
            System.out.println("\n lap: " + lap + "\n");
            bmwe46.speedUp();
            System.out.println(bmwe46.showCurrentSpeed());
            lexus.speedUp();
            System.out.println(lexus.showCurrentSpeed());
            audi.speedUp();
            System.out.println(audi.showCurrentSpeed());
            tesla.speedUp();
            System.out.println(tesla.showCurrentSpeed());
            Thread.sleep(2000);
            if (i == 2) {
                bmwe46.slowDown();
                lexus.slowDown();
                audi.slowDown();
                tesla.slowDown();
            } else if (i == 3) {
                bmwe46.useNitrousOxideEngine();
                System.out.println("\nBMW used Nitro: " + bmwe46.showCurrentSpeed());
                lexus.useNitrousOxideEngine();
                System.out.println("Lexus used Nitro: " + lexus.showCurrentSpeed());
                System.out.println(audi.showCurrentSpeed());
                System.out.println(tesla.showCurrentSpeed());
                if (bmwe46.getCurrentSpeed() > lexus.getCurrentSpeed() && bmwe46.getCurrentSpeed() > audi.getCurrentSpeed() && bmwe46.getCurrentSpeed() > tesla.getCurrentSpeed()) {
                    System.out.println("BMW WON THE RACE!!");
                } else if (lexus.getCurrentSpeed() > bmwe46.getCurrentSpeed() && lexus.getCurrentSpeed() > audi.getCurrentSpeed() && lexus.getCurrentSpeed() > tesla.getCurrentSpeed()) {
                    System.out.println("TESLA WON THE RACE!!");
                } else if (audi.getCurrentSpeed() > bmwe46.getCurrentSpeed() && audi.getCurrentSpeed() > lexus.getCurrentSpeed() && audi.getCurrentSpeed() > tesla.getCurrentSpeed()) {
                    System.out.println("AUDI WON THE RACE!!");
                } else {
                    System.out.println("TESLA WON THE RACE");
                }
            }

            System.out.println();
            lap++;

        }
    }
}



