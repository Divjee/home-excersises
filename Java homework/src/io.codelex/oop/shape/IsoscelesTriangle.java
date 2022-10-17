package io.codelex.oop.shape;

import io.codelex.oop.shape.Shape;

public class IsoscelesTriangle extends Shape {

    int height;
    int width;


    public IsoscelesTriangle(int numSides, int height, int width) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return height * width / 2;
    }

    @Override
    public int getPerimeter() {
        return width * getNumSides();
    }
}
