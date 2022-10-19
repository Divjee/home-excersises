package io.codelex.generics.practice.exercise4.exercise2;

import java.util.ArrayList;
import java.util.List;



public class AppConcatinate {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");
        System.out.println(concatinate(list));

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(8);
        System.out.println(concatinate(list2));

        List<Double> list3 = new ArrayList<>();
        list3.add(5.55);
        list3.add(67.45);
        System.out.println(concatinate(list3));

        List<List> list4 = new ArrayList<>();
          list4.add(list);
          list4.add(list2);
        System.out.println(concatinate(list4));
    }
    public static String concatinate(List<?> list){
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String: ";
            separator = " ";
        } else if (list.get(0) instanceof Number) {
            result = ((Number) list.get(0)).getClass().getSimpleName()+": ";
            separator = "+";
        } else if (list.get(0) != null) {
            separator = " ";
            result = list.get(0).getClass().getSimpleName()+": ";
        }
        for(Object i : list){
            if(list.indexOf(i) == list.size()-1){
                separator = "";
            }
            result = result + i + separator;

        }

        return result;
    }
}
