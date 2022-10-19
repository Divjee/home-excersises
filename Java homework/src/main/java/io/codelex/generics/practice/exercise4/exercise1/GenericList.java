package io.codelex.generics.practice.exercise4.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GenericList <T>{

    List<T>list = new ArrayList<>();


    public void add(int i, T el) {
        list.add(i, el);
    }

    public Object get(int i) {
        return null;
    }


}
