package com.futurcollars.lesson11.zad6;

public class WorkoutLengthCalculator {

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
}
