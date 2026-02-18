package com.edwaldoalmeida.javalivesummary.Enums.EnumBasic;

// An Enum type is a special data type that enables for a variable to be set of predefined constants (always in uppercase letters).

public class EnumBasic {
    public static void main(String[] args) {
        System.out.println("Hello Enums!");

        // DaysOfWeek
        Shop shop = new Shop();
        String openingHoursMonday = shop.getOpeningHours(DaysOfWeek.MONDAY);
        String openingHoursSaturday = shop.getOpeningHours(DaysOfWeek.SATURDAY);
        String openingHoursSunday = shop.getOpeningHours(DaysOfWeek.SUNDAY);

        // Rating 
        int rating = Rating.GOOD.getNumberOfStars();

        // just experimenting
        DaysOfWeek monday = DaysOfWeek.valueOf("MONDAY"); // returns the Object from the Enum
        String mondayName = monday.name();
        int mondayOrdinal = monday.ordinal();

        // get all enum values
        for (DaysOfWeek dow : DaysOfWeek.values()) {
            System.out.println(dow);
        }

        System.exit(1);
    }
}
