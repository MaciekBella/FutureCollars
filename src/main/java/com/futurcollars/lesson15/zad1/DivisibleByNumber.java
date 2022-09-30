package com.futurcollars.lesson15.zad1;

import java.util.stream.IntStream;

public class DivisibleByNumber {
    public void getNumberDivisibleByThree(IntStream number) {
        number
                .filter(n -> n % 3 == 0)
                .forEach(System.out::println);
    }
}
