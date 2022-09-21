package io.codelex.classesandobjects.practice.dog;

import io.codelex.classesandobjects.practice.dog.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog rocky = new Dog("Male", "Rocky", "Sam", "Molly");
        Dog max = new Dog("Male", "Max","Rocky", "Lady");
        Dog sparky = new Dog("Male", "Sparky");
        Dog buster = new Dog("Male", "Buster", "Sparky", "Lady");
        Dog sam = new Dog("Male", "Sam");
        Dog lady = new Dog("Female", "Lady");
        Dog molly = new Dog("Female", "Molly");
        Dog coco = new Dog("Female", "Coco", "Buster", "Molly");



        System.out.println(coco.hasFathersName());
        System.out.println(sparky.hasFathersName());

        coco.hasSameMother(rocky);



    }
}
