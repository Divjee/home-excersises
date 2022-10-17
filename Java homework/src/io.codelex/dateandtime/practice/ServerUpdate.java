package io.codelex.dateandtime.practice;

import java.time.*;
import java.util.ArrayList;
import java.util.Calendar;

public class ServerUpdate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 9, 14);
        LocalDate date1 = LocalDate.of(2022, 9, 30);
        updateDay(date, date1);

    }

    private static void updateDay(LocalDate launchDay, LocalDate checkUpadate) {
        LocalDate date = null;
        for (date = launchDay; date.isBefore(checkUpadate); ) {

            if (launchDay.getYear() == checkUpadate.getYear()) {
                date = date.plusWeeks(2);
                System.out.println("Upcoming update date: " + date.getDayOfMonth() + "/" + date.getMonth());
            }
        }


    }
}



