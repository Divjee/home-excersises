package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> list = new ArrayList<>();
        //TODO: Add 10 values to list
        for(int i = 0; i < 10; i++){
            list.add("A"+ i);
        }
        System.out.println(list);
        //TODO: Add new value at 5th position
        list.add(4,"A10");
        System.out.println(list);
        //TODO: Change value at last position (Calculate last position programmatically)
            list.set(list.size()-1,"Foobar");
            System.out.println(list);
        //TODO: Sort your list in alphabetical order
        Collections.sort(list);
        System.out.println(list);
        //TODO: Check if your list contains "Foobar" element
        System.out.println(list.contains("Foobar"));
        //TODO: Print each element of list using loop
        for(String i : list){
            System.out.println(i);
        }
    }

}
