package com.futurcollars.lesson8.zad3;

public class Circle implements AreaAndPerimeter {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
