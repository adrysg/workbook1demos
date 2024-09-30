package com.pluralsight;

import java.util.Scanner;

public class Demo4 {
    public static void  main(String[] args) {
        Scanner s = new Scanner(System.in);

        //String name = "Adrys";

        System.out.print("Hi, what's your name? ");
        String name = s.nextLine();
        String greeting = "Hello " + name;

        System.out.print("On average, how many days a week do you watch TV? ");
        int numberOfDaysPerWeekWatchesTv = s.nextInt();
        s.nextLine();
        //int numberOfDaysPerWeekWatchesTv = 5;

        System.out.print("When you do watcch TV, how many minutes do you watch?");
        int minutesPerDayOnDayWatchedOnAverage = s.nextInt();
        //int minutesPerDayOnDayWatchedOnAverage = 90;

        int minutesPerWeek = numberOfDaysPerWeekWatchesTv + minutesPerDayOnDayWatchedOnAverage;
        int minutesPerYear = minutesPerWeek * 52;

        int hoursPerYear = minutesPerYear / 60;

        int hoursInWorkWeek = 35;

        int workWeeksPerYearWatchingTv = hoursPerYear / hoursInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeeksPerYearWatchingTv + " week vacation every year");

        System.out.println(greeting);
    }
}
