package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exersise9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter meters ran");
        int meters = input.nextInt();
        System.out.println("Enter hours ran");
        int hours = input.nextInt();
        System.out.println("Enter minutes rab");
        int minutes = input.nextInt();
        System.out.println("Enter seconds ran");
        int seconds = input.nextInt();

        double totalRanSeconds = (hours * 60 + minutes) * 60 + seconds;
        double metersPerSecond = meters/totalRanSeconds;
        double kmPerHour = metersPerSecond * 3.6; // 3600sec. an hour / 1000m(1km)
        double milesPerHour = kmPerHour / 1.609344;




        System.out.println("Your speed in meters/second : " + String.format("%.8f",metersPerSecond));
        System.out.println("Your speed in km/h is :" + String.format("%.8f",kmPerHour));
        System.out.println("Your speed in miles/h is :" + String.format("%.8f",milesPerHour));
    }
}
