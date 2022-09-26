package com.futurcollars.lesson11.zad6;

public class Workout {

    public double getWorkoutLength(int length) {
        int weight = 1;
        int rate;
        if (length < 30) {
            rate = 1;
        } else if (length <= 60) {
            rate = 2;
        } else {
            rate = 3;
        }
        return rate * weight;
    }

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

    public double getPulse(int pulse) {
        int weight = 3;
        int rate;
        if (pulse < 160) {
            rate = 1;
        } else if (pulse <= 175) {
            rate = 2;
        } else {
            rate = 3;
        }
        return rate * weight;
    }
}
