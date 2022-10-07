package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise3 {

    //TODO: Write a Java program to insert an element into the array list at the first position.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);

        colors.add(0, "Purple");
        System.out.println(colors);

        colors.add(1, "Grey");
        colors.add(0,"Blue");

        System.out.println(colors);
    }

}
