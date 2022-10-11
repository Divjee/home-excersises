package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline{
    public Tiger(String animalName, String animalTyp, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalTyp, animalWeight, foodEaten, livingRegion);
    }


    public Tiger() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println(">Roooaarr");
    }

    @Override
    public void eat(Food item) {

        if(item.getClass().getSimpleName().equals("Vegetable") ){
            System.out.println(">Tiger does not eat vegetables");
            item.quantity = 0;
            setFoodEaten(item.quantity);
        }else if(item.getClass().getSimpleName().equals("Meat")) {
            setFoodEaten(item.quantity);
        }
    }

    @Override
    public String aboutAnimal() {
        return super.aboutAnimal();
    }

    @Override
    public String toString() {
        return "Tiger["+ getAnimalTyp() +", "+getAnimalWeight()+ ", "+ getLivingRegion()+", food eaten: "+getFoodEaten()+"]";
    }
}
