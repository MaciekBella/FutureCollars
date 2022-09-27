package com.futurcollars.lesson10.zad8;

public class Pesel {

    public Pesel() {
    }

    public void getNumberPesel(String pesel) throws IllegalLengthException, WrongTypeOfDataException {
        try {
            Integer.valueOf(pesel);
            if (pesel.length() != 11) {
                throw new IllegalLengthException("Nie odpowiednia długość peselu ");
            }
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("Zły pesel");
        }
    }
}
