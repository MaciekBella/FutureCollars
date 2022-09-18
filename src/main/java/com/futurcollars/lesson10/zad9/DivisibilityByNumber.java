package com.futurcollars.lesson10.zad9;

public class DivisibilityByNumber {

    public void validate(int[] values) {
        for (int number : values) {
            try {
                if (!isDivisibleByThree(number)) {
                    throw new IllegalArgumentException("Liczba nie jest podzielna przez 3 , liczba = " + number);
                }
                System.out.println(number);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}