package io.codelex.classesandobjects.practice.dog;

public class Dog {

    String gender;
    String name;

    String father;
    String mother;

    public Dog(String gender, String name, String father, String mother) {
        this.gender = gender;
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public Dog(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String hasFathersName() {
        if (father == null) {
            return "UNKNOWN";
        } else
            return father;
    }

    public boolean hasSameMother(Dog otherDog) {
        if (mother.equals(otherDog.mother)) {
            System.out.println("Has same mother");
            return true;
        } else {
            System.out.println("Not same mother");
            return false;
        }
    }


}
