package com.futurcollars.lesson8.zad7;

public class NameDayOfWeek {
    public String getNameDays(DayOfWeek day) {
        String nameDay;
        switch (day) {
            case PONIEDZIAŁEK:
                nameDay = "Poniedziałek";
                break;
            case WTOREK:
                nameDay = "Wtorek";
                break;
            case ŚRODA:
                nameDay = "Środa";
                break;
            case CZWARTEK:
                nameDay = "Czwartek";
                break;
            case PIĄTEK:
                nameDay = "Piątek";
                break;
            case SOBOTA:
                nameDay = "Sobota";
                break;
            case NIEDZIELA:
                nameDay = "Niedziela";
                break;
            default:
                nameDay = "BŁAD";
        }
        return nameDay;
    }
}