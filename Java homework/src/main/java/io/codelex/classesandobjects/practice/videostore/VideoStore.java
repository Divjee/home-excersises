package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {


    List<Video> inventory;

    Video video;


    public VideoStore() {
        inventory = new ArrayList<>();
    }

    protected void addNewVideo(String title) {
        Video video = new Video(title);
        inventory.add(video);
    }

    protected void rentOut(String title) {
        inventory.get(findByTitle(title)).isCheckedOut();
    }

    protected void returnVideo(String title) {
        inventory.get(findByTitle(title)).isReturned();
    }

    protected int findByTitle(String title) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return 0;
    }

    protected boolean isRentedOut(String title) {
        if (!inventory.get(findByTitle(title)).getTitle().equals(title)) {
            System.out.println("The video does not exist");
        } else if (inventory.get(findByTitle(title)).isRented()) {
            return inventory.get(findByTitle(title)).isRented();
        } else if (!inventory.get(findByTitle(title)).isRented()) {
            return inventory.get(findByTitle(title)).isRented();
        }
        return false;
    }
    protected void listInventory() {
        for (Video i : inventory) {
            System.out.println(i);
        }
    }
    protected void getRatingPercentage(String title) {
        if (inventory.get(findByTitle(title)).getRatingCount() > 0) {
            System.out.println("The percentage of people who liked the video is " + (100 * inventory.get(findByTitle(title)).getUsersLiked())
                    / inventory.get(findByTitle(title)).getRatingCount() + "%");
        }
    }
    @Override
    public String toString() {
        return "VideoStore{" +
                "inventory=" + inventory +
                '}';
    }
}









