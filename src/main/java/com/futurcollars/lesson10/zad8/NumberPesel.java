package com.futurcollars.lesson10.zad8;

import java.lang.invoke.WrongMethodTypeException;

public class NumberPesel {
    private String town;

    public NumberPesel(String town) {
        this.town = town;
    }

    public void getNumberPesel() throws IllegalLengthException {
        if (town.isEmpty()) {
            System.out.println(town);
            throw new WrongMethodTypeException("Plik jest pusty");
        } else if (town.length() >= 10) {
            throw new IllegalLengthException("Nie odpowiednia długość tekstu ");
        }
    }
}