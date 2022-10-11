package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Feline{
    public Cat(String animalName, String animalTyp, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalTyp, animalWeight, foodEaten, livingRegion);
    }

    public Cat() {
    }

    @Override
    public void makeSound() {
        System.out.println(">Meeeow");
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
        return "Cat["+ getAnimalTyp() +", "+df.format(getAnimalWeight())+ ", "+ getLivingRegion()+", food eaten: "+getFoodEaten()+"]";
    }
}
