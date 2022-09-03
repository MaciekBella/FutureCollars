package com.futurcollars.lesson8.zad2;

public class Square extends Shape {

    private int sideA;


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
