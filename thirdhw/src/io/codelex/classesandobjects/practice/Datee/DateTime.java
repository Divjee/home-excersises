package io.codelex.classesandobjects.practice.Datee;

import io.codelex.classesandobjects.practice.Datee.Datee;

import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Datee birthYear = new Datee();

        System.out.println("Choose a day");
        int day = in.nextInt();
        birthYear.setDay(day);
        System.out.println("Choose a month");
        int month = in.nextInt();
        birthYear.setMonth(month);
        System.out.println("Choose a year");
        int year = in.nextInt();
        birthYear.setYear(year);

        birthYear.displayDate();

        System.out.println(birthYear.getDay());
    }
}
