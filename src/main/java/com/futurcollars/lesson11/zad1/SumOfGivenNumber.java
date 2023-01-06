package com.futurcollars.lesson11.zad1;

public class SumOfGivenNumber {

    public SumOfGivenNumber() {
    }

    public int getSumOfGivenNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
