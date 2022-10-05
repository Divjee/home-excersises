package io.codelex.classesandobjects.practice.product;

public class ExerciseProduct {


    public static void main(String[] args) {

        Product Car1 = new Product("2000 SUBARU IMPREZA P1", 43.178, 2);
        Product Car2 = new Product("Bmw Serie 3 M3 Coupe (E46)", 52.300, 2);
        Product Car3 = new Product("Toyota Supra 1997 super turbo", 39.9000, 1);

        Car1.setPriceAtStart(52.355);
        Car2.setName("GTR");
        Car3.setAmountAtStart(7);

        System.out.println(Car2.getName());
        System.out.println(Car1.getPriceAtStart());
        System.out.println(Car3.getAmountAtStart());
    }
}

