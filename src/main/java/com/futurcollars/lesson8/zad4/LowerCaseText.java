package com.futurcollars.lesson8.zad4;

public class LowerCaseText implements TextFormatter {
    @Override
    public String formatText(String next) {
        return next.toLowerCase();
    }
}

