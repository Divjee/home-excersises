package io.codelex.polymorphism.practice.exercise5;

import java.math.BigDecimal;

public class Poster extends Advert {
    int numOfCopies;
    String dimensions;
    double costPerCopy;

    public Poster(int fee, int numOfCopies, String dimensions, double costPerCopy) {
        super(fee);
        this.numOfCopies = numOfCopies;
        this.dimensions = dimensions;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return  super.cost() +(int)(costPerCopy *numOfCopies);
    }

    @Override
    public String toString() {
        return super.toString() + " Number of copies= "+numOfCopies+ " Dimensions= "+dimensions+" Cost per copy= "+ costPerCopy ;
    }
}

