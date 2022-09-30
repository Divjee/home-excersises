package io.codelex.oop.shape2;

public class Cone extends ThreeDshape {
    int radius;
    int height;


    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI) * radius;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calcVol() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}
