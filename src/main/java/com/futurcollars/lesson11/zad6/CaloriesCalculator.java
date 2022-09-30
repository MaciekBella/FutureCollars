package com.futurcollars.lesson11.zad6;

public class CaloriesCalculator {

    public double getCalorieBurned(int calorie) {
        int weight = 2;
        int rate;
        if (calorie <= 300) {
            rate = 1;
        } else if (calorie < 400) {
            rate = 2;
        } else {
            rate = 3;
        }
        return rate * weight;
    }
}
