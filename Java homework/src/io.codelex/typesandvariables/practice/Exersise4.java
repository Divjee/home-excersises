package io.codelex.typesandvariables.practice;

public class Exersise4 {
    public static void main(String[] args) {
        String name = "Divje Bhandari";
        int dateOfBirth = 1996;

        printOut(name, dateOfBirth);
    }

    private static void printOut(String fullName, int dateOfBirth) {

        System.out.println("My name is " + fullName + " and I was born in " + dateOfBirth + ".");
    }
}
