package com.futurcollars.lesson8.zad3;

public class Square implements AreaAndPerimeter {

    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

    @Override
    public double getArea() {
        return Math.pow(sideA, 2);
    }
}
