package com.futurcollars.lesson8.zad2;

public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;
    private int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;

    }
    @Override
    public int getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public int getArea() {
        return sideA * height / 2;
    }
}
