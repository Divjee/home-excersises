package io.codelex.oop.shape;

public class RecTrian {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 5, 7);
        IsoscelesTriangle trian1 = new IsoscelesTriangle(3, 5, 8);

        System.out.println("Perimeter of rectangle :" + rec1.getPerimeter());
        System.out.println("Area of rectangle: " + rec1.getArea());

        System.out.println("Area of the triangle: " + trian1.getArea());
        System.out.println("Perimeter of triangle: " + trian1.getPerimeter());
    }
}
