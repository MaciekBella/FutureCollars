package com.futurcollars.lesson8.zad3;

public class Circle implements AreaAndPerimeter {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
