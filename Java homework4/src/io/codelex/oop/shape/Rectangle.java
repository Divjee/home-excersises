package io.codelex.oop.shape;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public int getPerimeter() {
        return width + height * (getNumSides() / 2);
    }
}
