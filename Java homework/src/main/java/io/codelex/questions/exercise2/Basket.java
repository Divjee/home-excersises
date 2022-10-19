package io.codelex.questions.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> items = new ArrayList<>();


    public void addItems(T item) {
        if (items.size() == 10) {
            throw new BasketFullException();
        } else {
            items.add(item);
        }
    }

    public void removeItems(T item) {
        if (items.isEmpty()) {
            throw new BasketEmptyException();
        } else {
            items.remove(item);
        }
    }

    public List<T> getItems() {
        return items;
    }
}
