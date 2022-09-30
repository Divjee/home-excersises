package io.codelex.oop.shape2;

public class Rectangle extends Shape {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return (length + height)*2;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }
}
