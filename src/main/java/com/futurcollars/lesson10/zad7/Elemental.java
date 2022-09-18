package com.futurcollars.lesson10.zad7;

public class Elemental {

    private double number;

    public Elemental(double number) {
        this.number = number;
    }

    public double replaceNumberOnElemental() {
        if (number > 0) {
            System.out.println(Math.sqrt(number));
        } else if (number < 0) {
            throw new IllegalArgumentException();
        }
        return number;
    }
}
