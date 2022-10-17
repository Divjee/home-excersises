package io.codelex.oop.shape2;

public class TestShape2 {
    public static void main(String[] args) {
        Cone cone = new Cone(16, 20);
        Cube cube = new Cube(12);
        Hexagon hex = new Hexagon(7);
        Rectangle rec = new Rectangle(7, 3);
        Triangle tri = new Triangle(5, 4, 6);


        System.out.println(cone.calcVol());
        System.out.println(cube.calculatePerimeter());
        System.out.println(hex.calculateArea());
    }
}
