package com.futurcollars.lesson6.zad4;

public class DaysOfTheWeek {
    public static String getNameOfTheWeekDay(int numberDay) {
        String nameDay;
        switch (numberDay) {
            case 1:
            case 2:
            case 4:
            case 5:
                nameDay = "Monday";
                break;
            case 6:
            case 7:
                nameDay = "Weekend";
                break;
            default:
                nameDay = "There is no such day!";
                break;
        }
        return nameDay;

    }
}
