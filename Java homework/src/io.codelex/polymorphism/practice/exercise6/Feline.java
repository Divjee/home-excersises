package io.codelex.polymorphism.practice.exercise6;

public abstract class Feline extends Mammal {
    public Feline(String animalName, String animalTyp, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalTyp, animalWeight, foodEaten, livingRegion);
    }

    public Feline() {
        super();
    }
}
