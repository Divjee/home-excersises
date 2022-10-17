package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class employeeHours {
    public static void main(String[] args) {

        LocalDate dat1 = LocalDate.of(2022, 01, 10);
        LocalDate date2 = LocalDate.of(2022, 01, 20);

        calculateWorkingHours(dat1, date2);

    }

    private static void calculateWorkingHours(LocalDate from, LocalDate to) {
        int hoursInADay = 24;
        long totalHoursBetween = Duration.between(from.atStartOfDay(), to.atStartOfDay()).toHours();
        int count = 0;
        for (LocalDate date = from; date.isBefore(to); date = date.plusDays(1)) {

            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                count++;
            } else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }
        }
        int weekendHours = count * hoursInADay;
        long totalWorkingHours = totalHoursBetween - weekendHours;

        System.out.println(totalWorkingHours);

    }


}

