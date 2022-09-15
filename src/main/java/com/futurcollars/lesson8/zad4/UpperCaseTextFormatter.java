package com.futurcollars.lesson8.zad4;

public class UpperCaseTextFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
