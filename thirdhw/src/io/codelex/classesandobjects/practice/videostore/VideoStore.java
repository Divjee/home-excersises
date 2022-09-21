package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {


    static List<String> inventory = new ArrayList<>();

    public void addToInventory() {
        inventory.add(Video.title);

    }

    public void removeFromStore() {
        inventory.remove(Video.title);
    }

    public void beingCheckedOut() {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) == Video.title) {
                inventory.remove(Video.title);
            }
        }
    }
    public void returning() {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) != Video.title) {
                inventory.add(Video.title);
            }
        }
    }



}









