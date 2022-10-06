package com.futurcollars.lesson15.zad1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DivisibleByNumber divisibleByNumber = new DivisibleByNumber();
        List<Integer> numberList = divisibleByNumber.getARangeOfNumbersDivisibleByThree(54, 645);
        numberList.stream().forEach(System.out::println);
    }
}
