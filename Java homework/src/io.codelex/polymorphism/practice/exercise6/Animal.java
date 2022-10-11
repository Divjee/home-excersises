package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
   private String animalName;
   private String animalTyp;
   private Double animalWeight;
   private Integer foodEaten;

    public Animal(String animalName, String animalTyp, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalTyp = animalTyp;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public Animal() {

    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalTyp(String animalTyp) {
        this.animalTyp = animalTyp;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalTyp() {
        return animalTyp;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public abstract void makeSound();
    public abstract void eat(Food item);

}
