package com.ws.rest.carrental.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePeriodUtils {

    public static boolean isInPeriod(LocalDate date, DatePeriod period) {
        return (date.isAfter(period.getStart()) && date.isBefore(period.getEnd()))
                || date.isEqual(period.getStart())
                || date.isEqual(period.getEnd());
    }

    public static DatePeriod getDatePeriod(String start, String end) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return new DatePeriod(LocalDate.parse(start, formatter), LocalDate.parse(end, formatter));
    }

    public static LocalDate getLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }

}
