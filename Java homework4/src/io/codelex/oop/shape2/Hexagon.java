package io.codelex.oop.shape2;

public class Hexagon extends Shape {
    private int sideLength;

    public Hexagon(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return sideLength * 6;
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(sideLength)) * (sideLength * sideLength)) / 2;
    }

    public int getSideLength() {
        return sideLength;
    }
}
