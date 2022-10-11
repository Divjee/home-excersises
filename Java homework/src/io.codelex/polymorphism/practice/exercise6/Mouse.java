package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalTyp, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalTyp, animalWeight, foodEaten, livingRegion);
    }

    public Mouse() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println(">Squeek squeek squeek");
    }

    @Override
    public void eat(Food item) {
        setFoodEaten(item.quantity);
    }

    @Override
    public String aboutAnimal() {
        return super.aboutAnimal();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.#");
        return "Mouse["+ getAnimalTyp() +", "+df.format(getAnimalWeight())+ ", "+ getLivingRegion()+", food eaten: "+getFoodEaten()+"]";
    }
}
