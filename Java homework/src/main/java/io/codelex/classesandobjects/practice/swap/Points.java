package io.codelex.classesandobjects.practice.swap;

public class Points {
    private int Y;
    private int X;

    public Points(int Y, int X) {
        this.Y = Y;
        this.X = X;
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

    public int getY() {
        return Y;
    }

    public int getX() {
        return X;
    }
}
