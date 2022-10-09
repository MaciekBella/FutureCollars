package com.futurcollars.lesson14.zad6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Birthday {

    public int getTheAgeOfThePerson(LocalDate date) {
        return 2022 - date.getYear();
    }

    public DayOfWeek getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    public int getWeekOfYear(LocalDate date) {
        return date.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
    }
}
