package com.futurcollars.lesson15.zad1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        IntStream intStream = IntStream.of(5, 6, 9, 16, 15, 18, 13, 19, 30, 36);
        DivisibleByNumber divisibleByNumber = new DivisibleByNumber();
        divisibleByNumber.getNumberDivisibleByThree(intStream);
    }
}
