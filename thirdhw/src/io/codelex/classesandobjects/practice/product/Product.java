package io.codelex.classesandobjects.practice.product;

public class Product {
    String name;
    double priceAtStart;
    int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
        printProduct();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println("You have " + name + " which is at a price of " + priceAtStart + " and we only have " +
                amountAtStart + " units left");
    }
}