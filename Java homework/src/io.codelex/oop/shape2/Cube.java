package io.codelex.oop.shape2;

public class Cube extends ThreeDshape {

    private int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return sideLength * 12;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calcVol() {
        return Math.pow(sideLength, 3);
    }
}
