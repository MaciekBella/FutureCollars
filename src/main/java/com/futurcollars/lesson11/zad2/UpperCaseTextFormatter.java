package com.futurcollars.lesson11.zad2;

public class UpperCaseTextFormatter {
    private String text;

    public UpperCaseTextFormatter(String text) {
        this.text = text;
    }

    public String getConvertToUpperCase() {
        return text.toUpperCase();
    }
}
