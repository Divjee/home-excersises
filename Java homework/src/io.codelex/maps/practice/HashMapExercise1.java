package io.codelex.maps.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise1 {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Green");
        myMap.put(3, "Black");
        myMap.put(4, "White");
        myMap.put(5, "Blue");

        //TODO: Print size of myMap
        System.out.println(myMap.size());

        //TODO: Check if myMap contains key 3
        if (myMap.containsKey(3)) {
          System.out.println("Contains! :)");
        } else {
          System.out.println("Does not contains. :(");
        }

        //TODO: Check if myMap contains value "White"
        if (myMap.containsValue("Blue")) {
          System.out.println("Contains! :)");
        } else {
          System.out.println("Does not contains. :(");
        }

        //TODO: Create new map and clone values from myMap into new map
        Map<Integer,String>newMap = new HashMap<>();
        newMap.putAll(myMap);
        System.out.println(newMap);

        //TODO: Iterate over map entries and print keys and values of each entry
        for(Map.Entry entry: myMap.entrySet()){
          System.out.print(entry.getKey()+" ");//COULD ALSO JUST PUT ENTRY IN PRINTLN
          System.out.print(entry.getValue());
          System.out.println();
        }

        //TODO: Clear myMap
        myMap.clear();
        System.out.println("Hash map after clearing: " + myMap);
    }

}
