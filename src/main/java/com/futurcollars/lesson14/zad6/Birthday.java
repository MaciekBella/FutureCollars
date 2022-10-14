package com.futurcollars.lesson14.zad6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

public class Birthday {


    public int getTheAgeOfThePerson(LocalDate date) {
        return Period.between(date,LocalDate.now()).getYears();
    }

    public DayOfWeek getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    public int getWeekOfYear(LocalDate date) {
        return date.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
    }
}
