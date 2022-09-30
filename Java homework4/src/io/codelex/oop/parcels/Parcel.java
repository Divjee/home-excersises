package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;

    }

    @Override
    public boolean vlidatatable() {

        if (xLength + yLength + zLength > 300) {
            isExpress = false;
            System.out.println("The dimensions exceed 300");
        } else if (xLength < 30 || yLength < 30 || zLength < 30) {
            isExpress = false;
            System.out.println("X, Y and Z lengths should be at least 30");
        } else if (weight > 30) {
            isExpress = false;
        } else if (weight < 15) {
            isExpress = false;
        } else {
            System.out.println("Your package is deliverable");
            isExpress = true;
        }

        return isExpress;
    }


}
