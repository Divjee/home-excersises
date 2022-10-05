package io.codelex.classesandobjects.practice.swap;

public class Pointy {
    public static void main(String[] args) {
        Points point1 = new Points(5, 2);
        Points point2 = new Points(-3, 6);


        Points.swapThem(point1, point2);

        System.out.println(point1.getY() + " , " + point1.getX());
        System.out.println(point2.getY() + " , " + point2.getX());

    }

}
