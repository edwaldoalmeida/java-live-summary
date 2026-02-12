package com.edwaldoalmeida.javalivesummary.Enums;

// An Enum type is a special data type that enables for a variable to be set of predefined constants (always in uppercase letters).

public class Enums {
    public static void main(String[] args) {
        System.out.println("Hello Enums!");

        Shop shop = new Shop();
        String openingHoursMonday = shop.getOpeningHours(DaysOfWeek.MONDAY);
        String openingHoursSaturday = shop.getOpeningHours(DaysOfWeek.SATURDAY);
        String openingHoursSunday = shop.getOpeningHours(DaysOfWeek.SUNDAY);

        System.exit(1);
    }
}
