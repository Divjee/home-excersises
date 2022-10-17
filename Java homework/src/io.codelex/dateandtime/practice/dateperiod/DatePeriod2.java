package io.codelex.dateandtime.practice.dateperiod;

import io.codelex.dateandtime.practice.dateperiod.DatePeriod;

import java.time.LocalDate;

public class DatePeriod2 {


    public static void main(String[] args) {


        LocalDate firstStart = LocalDate.of(2022, 3, 9);
        LocalDate firstEnd = LocalDate.of(2022, 3, 13);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 3, 10);
        LocalDate secondEnd = LocalDate.of(2022, 3, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
    }


}
