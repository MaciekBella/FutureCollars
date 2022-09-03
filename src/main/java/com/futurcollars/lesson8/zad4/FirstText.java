package com.futurcollars.lesson8.zad4;

public class FirstText implements TextFormatter {

    @Override
    public String formatText(String next) {
        return next.toUpperCase();
    }
}
