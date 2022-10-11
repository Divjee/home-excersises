package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalTyp, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalTyp, animalWeight, foodEaten, livingRegion);
    }


    public Zebra() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println(">Zebra makes sound");
    }

    @Override
    public void eat(Food item) {
        if(item.getClass().getSimpleName().equals("Meat") ){
            System.out.println(">Zebras are herbivores");
            item.quantity = 0;
            setFoodEaten(item.quantity);
        }else if(item.getClass().getSimpleName().equals("Vegetable")) {
            setFoodEaten(item.quantity);
        }
    }

    @Override
    public String aboutAnimal() {
        return super.aboutAnimal();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.#");
        return "Zebra["+ getAnimalTyp() +", "+df.format(getAnimalWeight())+ ", "+ getLivingRegion()+", food eaten: "+getFoodEaten()+"]";
    }
}
