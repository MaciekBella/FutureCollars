package com.futurcollars.lesson8.zad2;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(8);
        System.out.println("Pole kwadratu: " + square.getArea() + "\n" + "Obwód kwadratu: " + square.getPerimeter());
        Triangle triangle = new Triangle(6, 8, 4, 8);
        System.out.println("Pole trójkąta: " + triangle.getArea() + "\n" + "Obwód trójkąta: " + triangle.getPerimeter());
        Circle circle = new Circle(8);
        System.out.println("Pole koła: " + circle.getArea() + "\n" + "Obwód koła: " + circle.getPerimeter());
        Rectangle rectangle = new Rectangle(8, 12);
        System.out.println("Pole prostokąta: " + rectangle.getArea() + "\n" + "Obwód prostokąta: " + rectangle.getPerimeter());

    }
}
