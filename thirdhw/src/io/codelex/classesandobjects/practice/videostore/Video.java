package io.codelex.classesandobjects.practice.videostore;

public class Video {
    static String title;
    static boolean checkedOut = true;
    int rating;


    public Video(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public Video(String title) {
        this.title = title;
    }

    public static boolean checkedOut() {
        return checkedOut;
    }
    }



