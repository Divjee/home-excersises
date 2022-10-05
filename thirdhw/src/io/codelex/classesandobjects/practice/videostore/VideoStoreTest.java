package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        VideoStore store = new VideoStore();

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard, store);
                    break;
                case 2:
                    rentVideo(store);
                    break;
                case 3:
                    returnVideo(keyboard, store);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner, VideoStore inv) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            scanner.nextLine();
            String movieName = scanner.nextLine();
            inv.addNewVideo(movieName);
            System.out.println("Enter rating 1 (1-5)");
            double rating = scanner.nextDouble();
            inv.inventory.get(i).setAverageUserRating(rating);
            System.out.println("Enter rating 2 (1-5)");
            rating = scanner.nextDouble();
            inv.inventory.get(i).setAverageUserRating(rating);
            System.out.println("Enter rating 3 (1-5)");
            rating = scanner.nextDouble();
            inv.inventory.get(i).setAverageUserRating(rating);
        }
    }

    private static void rentVideo(VideoStore video) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a video you want to rent out");
        String movieName = scanner.nextLine();
        if (movieName.equals("Matrix") && !video.isRentedOut(movieName)) {
            video.rentOut(movieName);
            video.getRatingPercentage(movieName);
        } else if (movieName.equals("Godfather") && !video.isRentedOut(movieName)) {
            video.rentOut(movieName);
            video.getRatingPercentage(movieName);
            System.out.println();
            video.listInventory();
        } else if (movieName.equals("Star Wars") && !video.isRentedOut(movieName)) {
            video.rentOut(movieName);
            video.getRatingPercentage(movieName);
        } else if (video.isRentedOut(movieName)) {
            System.out.println("Movie has been already rented out");
        }

    }

    private static void returnVideo(Scanner scanner, VideoStore video) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is the movie you will be returning");
        String movieName = scanner1.nextLine();
        double userRating;
        if (movieName.equals("Matrix") && video.isRentedOut(movieName)) {
            video.returnVideo(movieName);
            System.out.println("What would you rate the video (1-5)");
            userRating = scanner1.nextDouble();
            video.inventory.get(video.findByTitle(movieName)).setAverageUserRating(userRating);
        } else if (movieName.equals("Godfather") && video.isRentedOut(movieName)) {
            video.returnVideo(movieName);
            System.out.println("What would you rate the video (1-5)");
            userRating = scanner1.nextDouble();
            video.inventory.get(video.findByTitle(movieName)).setAverageUserRating(userRating);
            video.listInventory();
        } else if (movieName.equals("Star Wars") && video.isRentedOut(movieName)) {
            System.out.println("What would you rate the video (1-5)");
            userRating = scanner1.nextDouble();
            video.inventory.get(video.findByTitle(movieName)).setAverageUserRating(userRating);
            video.returnVideo(movieName);
        } else if (!video.isRentedOut(movieName)) {
            System.out.println("Movie has been already been given back");
        }
    }
}
