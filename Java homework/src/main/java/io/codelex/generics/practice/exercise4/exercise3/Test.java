package io.codelex.generics.practice.exercise4.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();


        add1(5, list);
        System.out.println(list.get(0));

        add2("Hello", list);
        System.out.println(list);

        System.out.println(list.get(0).getClass().getSimpleName());
        System.out.println(list.get(1).getClass().getSimpleName());

        List<String> list2 = new ArrayList<>();
        list2.add("Bye");
        addAllX(list2, list);
        System.out.println(list);

        List<String> list3 = new ArrayList<>();
        addAllY(list2, list3);
        System.out.println(list3);

        List<Integer>list4 = new ArrayList<>();
        list4.add(70);
        addAllX(list4,list);
        System.out.println(list);
    }

    public static void add1(Object value, List<? super Object> list) {
        list.add(value);
    }

    public static <T> void add2(T value, List<T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) { //this function can have V as a parameter, in my case String and it adds the values to a list
                                                                    //that is the parent of the first function parameter, String parent is Object in my example.
        for (V el : v) l.add(el);
    }

    public static <V> void addAllY(List<V> v, List<V> l) { //this function list can only add v list to l if they have the same type
        for (V el : v) l.add(el);
    }
}
