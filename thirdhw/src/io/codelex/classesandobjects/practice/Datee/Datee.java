package io.codelex.classesandobjects.practice.Datee;

public class Datee {
    int day;
    int month;
    int year;


    public Datee() {
    }

    public Datee(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println( day + "/"+month+"/"+year);
    }
}
