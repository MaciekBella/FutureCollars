package com.futurcollars.lesson10.zad8;

public class Main {
    public static void main(String[] args) throws IllegalLengthException, WrongTypeOfDataException {
        Pesel numberPesel = new Pesel();
        numberPesel.getNumberPesel("45678935645");
    }
}
