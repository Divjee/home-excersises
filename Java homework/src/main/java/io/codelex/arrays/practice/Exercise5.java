package io.codelex.arrays.practice;

import java.util.ArrayList;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexOfElement36 = -1;
        int indexOfElement29 = -1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < myArray.length; i++) {
            list.add(myArray[i]);
        }
        indexOfElement36 = list.indexOf(36);
        indexOfElement29 = list.indexOf(29);


        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);

    }
}
