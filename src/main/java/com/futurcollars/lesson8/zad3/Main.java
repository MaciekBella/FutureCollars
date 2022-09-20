package com.futurcollars.lesson8.zad3;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(6);
        System.out.println("Pole kwadratu: " + square.getArea() + "\n"+ "Obwód kwadratu: " + square.getPerimeter());
        Circle circle = new Circle(3);
        System.out.println("Pole koła: " + circle.getArea() + "\n" + "Obwód koła: " + circle.getPerimeter());

    }
}
