package com.futurcollars.lesson14.zad6;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        LocalDate dateOfBirth = LocalDate.of(2000, Month.MARCH, 15);
        Birthday birthday = new Birthday();
        System.out.println(birthday.getTheAgeOfThePerson(dateOfBirth) + " Years");
        System.out.println();
        System.out.println(birthday.getDayOfWeek(dateOfBirth));
        System.out.println();
        System.out.println(birthday.getWeekOfYear(dateOfBirth));
    }
}
