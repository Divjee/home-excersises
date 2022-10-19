package io.codelex.generics.practice.exercise4.exercise1;

import java.util.ArrayList;
import java.util.List;

public class SubclassInt implements ImplementList {


    List<Integer> list = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        list.add(i, (Integer) el);
    }

    @Override
    public Object get(int i) {
        return null;
    }
}
