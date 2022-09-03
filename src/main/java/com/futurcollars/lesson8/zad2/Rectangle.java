package com.futurcollars.lesson8.zad2;

public class Rectangle extends Shape  {

    private int sideA;
    private  int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
   public int getArea(){
        return sideA * sideB;
    }

    @Override
   public int getPerimeter(){
        return 2 * sideA + 2 * sideB;
    }
}
