package com.futurcollars.lesson8.zad3;

public class Square implements AreaAndPerimeter {

    int sideA;

    public Square(int sideA) {
        this.sideA = sideA;

    }

    @Override
    public int getPerimeter() {
        return 4 * sideA;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(sideA, 2);
    }
}
