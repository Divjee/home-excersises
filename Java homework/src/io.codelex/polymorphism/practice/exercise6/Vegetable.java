package io.codelex.polymorphism.practice.exercise6;

public class Vegetable extends Food{

    public Vegetable(Integer quantity) {
        super(quantity);

    }

    public Vegetable(){}

    @Override
    public String toString() {
        return "Vegetable " + quantity;
    }
}
