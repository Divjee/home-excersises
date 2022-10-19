package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        List<String> car = new ArrayList<>();
        HashSet<String> cars = new HashSet<>();
        for (String i : array) {
            car.add(i);
            cars.add(i);
        }
        System.out.println("This is arrayList: " + car);
        System.out.println("This is HashSet: " + cars);

        HashMap<String, Integer> data = new HashMap<>();
        data.put(array[0], 1920);
        data.put(array[1], 1921);
        data.put(array[2], 1922);
        data.put(array[3], 1933);
        data.put(array[4], 1955);
        data.put(array[5], 1933);
        data.put(array[6], 1965);

        System.out.println("This is HashMap: " + data);
    }
}
