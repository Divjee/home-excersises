package io.codelex.classesandobjects.practice.swap;

public class Pointy {
    public static void main(String[] args) {
        Points point1 = new Points(5,2);
        Points point2 = new Points(-3,6);


    swapThem(point1,point2);

    System.out.println(point1.Y + " , "+ point1.X);
    System.out.println(point2.Y+ " , "+ point2.X );

    }
    public static void swapThem(Points point1, Points point2) {
        int temp = point1.X;
        int temp2 = point1.Y;
        int temp3 = point2.X;
        int temp4 = point2.Y;

        point2.X = temp;
        point2.Y = temp2;

        point1.X = temp3;
        point1.Y = temp4;

    }
}
