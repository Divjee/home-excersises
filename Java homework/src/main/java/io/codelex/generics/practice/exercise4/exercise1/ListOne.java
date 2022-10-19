package io.codelex.generics.practice.exercise4.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ListOne  {

    List<String>list = new ArrayList<>();

    public void add(int i, String el) {
        list.add(i,el);
    }


    public Object get(int i) {
        return list.get(i);
    }
}
