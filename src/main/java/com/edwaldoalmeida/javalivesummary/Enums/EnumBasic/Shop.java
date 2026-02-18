package com.edwaldoalmeida.javalivesummary.Enums.EnumBasic;

public class Shop {
    public String getOpeningHours(DaysOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return "9am - 5pm";
            case SATURDAY:
                return "10am - 4pm";
            case SUNDAY:
                return "Closed.";
            default:
                return "Option doesn't exist.";
        }
    }
}
