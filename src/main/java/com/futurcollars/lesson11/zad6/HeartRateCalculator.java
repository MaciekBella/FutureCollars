package com.futurcollars.lesson11.zad6;

public class HeartRateCalculator {

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
