package com.futurcollars.lesson8.zad6;

public class BillCalculator {

    public double calculate(double billValue, float serviceFee) {
        return billValue + serviceFee;
    }

    public double calculate(double billValue, float serviceFee, double discount) {
        return billValue - (1 - discount / 100) + serviceFee;
    }

    public double calculate(double billValue, float serviceFee, short takeOutFee) {
        return billValue + serviceFee + takeOutFee;
    }
}
