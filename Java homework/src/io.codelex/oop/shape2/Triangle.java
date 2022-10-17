package io.codelex.oop.shape2;

import io.codelex.oop.shape2.Shape;

public class Triangle extends Shape {
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public Triangle(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double calculateArea() {
        double S = calculatePerimeter() / 2;
        return Math.sqrt(S * (S - sideOne) * (sideTwo) * (sideThree));
    }
}
