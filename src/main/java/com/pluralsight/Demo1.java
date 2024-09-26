package com.pluralsight;

public class Demo1 {
    public static void  main(String[] args) {
        System.out.println("Hello World!");


        String name = "Adrys";
        String greeting = "Hello " + name;
        // string greeting = "Hello Adrys";

        int numberOfDaysPerWeekWatchesTv = 5;
        int minutesPerDayOnDayWatchedOnAverage = 90;

        int minutesPerWeek = numberOfDaysPerWeekWatchesTv + minutesPerDayOnDayWatchedOnAverage;
        int minutesPerYear = minutesPerWeek * 52;

        int hoursPerYear = minutesPerYear / 60;

        int hoursInWorkWeek = 35;

        int workWeeksPerYearWatchingTv = hoursPerYear / hoursInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeeksPerYearWatchingTv + " week vacation every year");

        System.out.println(greeting);
    }
}
