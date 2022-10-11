package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal{

   String livingRegion;

    public Mammal(String animalName, String animalTyp, Double animalWeight, Integer foodEaten,String livingRegion) {
        super(animalName, animalTyp, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public Mammal() {

    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public String aboutAnimal(){
        return getAnimalName() + " " + getAnimalTyp() + " "+ getAnimalWeight()+ " "+ getLivingRegion();
    }
}
