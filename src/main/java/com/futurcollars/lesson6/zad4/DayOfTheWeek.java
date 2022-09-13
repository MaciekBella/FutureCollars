package com.futurcollars.lesson6.zad4;

public class DayOfTheWeek {
    public static String getNameOfTheWeekDay(int numberDay) {
        String nameDay;
        switch (numberDay) {
            case 1:
                nameDay = "Monday";
                break;
            case 2:
                nameDay = "Tuesday";
                break;
            case 3:
                nameDay = "Wednesday";
                break;
            case 4:
                nameDay = "Thursday";
                break;
            case 5:
                nameDay = "Friday";
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
