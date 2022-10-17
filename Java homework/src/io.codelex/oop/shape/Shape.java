package io.codelex.oop.shape;


public abstract class Shape {

    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract int getArea();


    public abstract int getPerimeter();

}
