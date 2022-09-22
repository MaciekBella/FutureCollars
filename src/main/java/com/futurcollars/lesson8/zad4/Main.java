package com.futurcollars.lesson8.zad4;

public class Main {
    public static void main(String[] args) {
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        System.out.println(upperCaseTextFormatter.formatText("Uczenie Java sprawia mi przyjemność"));
        LowerCaseTextFormatter lowerCaseTextFormatter = new LowerCaseTextFormatter();
        System.out.println(lowerCaseTextFormatter.formatText("Uczenie Java sprawia mi przyjemność"));
    }
}