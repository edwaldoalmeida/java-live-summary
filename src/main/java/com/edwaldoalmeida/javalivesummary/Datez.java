package com.edwaldoalmeida.javalivesummary;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// `java.time.LocalDate` date without timezone

public class Datez {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2026, 02, 06);
        LocalDate date2 = LocalDate.of(2025, 02, 06);
        System.out.println(date1);
        System.out.println(date2);

        boolean isDate1AfterDate2 = date1.isAfter(date2);
        boolean isDate2BeforeDate1 = date2.isBefore(date1);

        int date1Month = date1.getDayOfMonth();

        LocalDate tomorrow = date1.plusDays(1); // returns a new LocalDate instance as LocalDate is immutable
        
        // LocalDateTime
        LocalDateTime datetime = LocalDateTime.of(2026, 02,06, 4,25,01);
        System.out.println(datetime);

        // convert from LocalDate to LocalDateTime
        LocalDateTime date1DateTime = date1.atTime(4, 26, 01);
        System.out.println(date1DateTime);
        String date1DateTimeString = date1DateTime.toString();
        System.out.println(date1DateTimeString);

        // parsing a string
        LocalDateTime parsed = LocalDateTime.parse("2026-02-06T04:25:01");
        System.out.println(parsed);
        System.out.println(parsed.equals(datetime));

        // parsing a string in a different format (using java.time.format.DateTimeFormatter)
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate formattedDate = LocalDate.parse("06/02/2026", parser);
        System.out.println(formattedDate);

        // calculating something
        LocalDateTime dateToday = LocalDateTime.of(2026, 02, 06, 23, 59, 00);
        LocalDateTime dateTomorrow = LocalDateTime.of(2026, 02, 07, 00, 01, 00);
        // LocalDateTime result = dateTomorrow - dateToday;
        long duration = Duration.between(dateToday, dateTomorrow).toMinutes();
        System.out.println(duration + " minutes");

        // how to work with DateTime with different timezones?
        

    }
}
