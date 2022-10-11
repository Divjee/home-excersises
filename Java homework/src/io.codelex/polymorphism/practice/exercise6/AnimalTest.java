package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mammal animal = null;

        int i = 0;
        String animalType = "";
        List<String> animalInfo = new ArrayList<>();
        while (true) {
            if (i >= 1) {
                in.nextLine();
            }
            System.out.println("What type of animal do you want to add? (Cat, Tiger, Zebra, Mouse?). Type END to exit");
            animalType = in.nextLine().toLowerCase();
            animalType.toLowerCase();
            if (animalType.equals("end")) {
                System.out.println(animalInfo);
                break;
            }
            if (animalType.equals("tiger")) {
                animal = new Tiger();
            } else if (animalType.equals("cat")) {
                animal = new Cat();
            } else if (animalType.equals("mouse")) {
                animal = new Mouse();
            } else if (animalType.equals("zebra")) {
                animal = new Zebra();
            } else {
                System.out.println("You dont have that kind of animal");
                    break;
            }
            animal.setAnimalName(animal.getClass().getSimpleName());
            System.out.println("What type of " + animal.getClass().getSimpleName().toLowerCase() + " is it?");
            String setType = in.nextLine();
            animal.setAnimalTyp(setType);
            System.out.println("What does it weigh?");
            double setWeight = in.nextDouble();
            animal.setAnimalWeight(setWeight);
            System.out.println("What is its origin?");
            in.nextLine();
            String origin = in.nextLine();
            animal.setLivingRegion(origin);
            System.out.println("What will you give the animal to eat (Veg/Meat)?");
            String food = in.nextLine().toLowerCase();
            food.toLowerCase();
            System.out.println("How much of it will you give it?");
            int foodKg = in.nextInt();
            if (food.equals("veg")) {
                Vegetable veg = new Vegetable(foodKg);
                System.out.println(animal.aboutAnimal());
                animal.makeSound();
                System.out.println(veg.toString());
                animal.eat(veg);
            } else if (food.equals("meat")) {
                Meat meat = new Meat(foodKg);
                System.out.println(animal.aboutAnimal());
                animal.makeSound();
                System.out.println(meat.toString());
                animal.eat(meat);
                animal.eat(meat);
            }
            animalInfo.add(animal.toString());
            System.out.println(">" + animalInfo);
            i++;
            System.out.println();
        }
    }
}
