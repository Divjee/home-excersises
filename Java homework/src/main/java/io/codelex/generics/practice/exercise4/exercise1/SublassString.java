package io.codelex.generics.practice.exercise4.exercise1;

import java.util.ArrayList;
import java.util.List;

public class SublassString implements ImplementList {

    List<String> list = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        list.add(i, (String) el);
    }

    @Override
    public Object get(int i) {
        return null;
    }
}
