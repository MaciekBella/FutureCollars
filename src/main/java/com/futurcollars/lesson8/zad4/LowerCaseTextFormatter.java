package com.futurcollars.lesson8.zad4;

public class LowerCaseTextFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}