package io.codelex.dateandtime.practice.dateperiod;

import java.time.LocalDate;

public class DatePeriod {
    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod date2) {

        DatePeriod overlapped;
        DatePeriod date1 = new DatePeriod(this.start, this.end);
        if (!ifDatesOverlap(date1, date2)) {
            return null;
        } else {
            overlapped = new DatePeriod(date1.end, date2.start);
            System.out.println(date2.start);
            System.out.println(date1.end);
        }
        return overlapped;
    }

    private boolean ifDatesOverlap(DatePeriod one, DatePeriod two) {
        return one.start.isBefore(two.end) && one.end.isAfter(two.start);
    }


}

