package com.futurecollars.lesson8.zad2;

import com.futurcollars.lesson8.zad2.Circle;
import com.futurcollars.lesson8.zad2.Rectangle;
import com.futurcollars.lesson8.zad2.Square;
import com.futurcollars.lesson8.zad2.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    @Test
    void shouldGetPerimeterSquare() {
        // given
        int number = 9;
        // when
        double resultPerimeterSquare = new Square(number).getPerimeter();
        // then
        Assertions.assertEquals(36, resultPerimeterSquare);
    }

    @Test
    void shouldGetAreaSquare() {
        // given
        int number = 8;
        // when
        double resultAreaSquare = new Square(number).getArea();
        // then
        Assertions.assertEquals(64, resultAreaSquare);
    }

    @Test
    void shouldGetPerimeterTriangle() {
        // given
        int sideA = 6;
        int sideB = 8;
        int sideC = 4;
        int height = 8;
        // when
        double resultPerimeterTriangle = new Triangle(sideA, sideB, sideC, height).getPerimeter();
        // then
        Assertions.assertEquals(18, resultPerimeterTriangle);
    }

    @Test
    void shouldGetAreaTriangle() {
        // given
        int sideA = 6;
        int sideB = 8;
        int sideC = 4;
        int height = 8;
        // when
        double resultAreaTriangle = new Triangle(sideA, sideB, sideC, height).getArea();
        // then
        Assertions.assertEquals(24, resultAreaTriangle);
    }

    @Test
    void shouldGetPerimeterCircle() {
        // given
        int number1 = 8;
        // when
        double resultPerimeterCircle = new Circle(number1).getPerimeter();
        // then
        Assertions.assertEquals(50, resultPerimeterCircle);
    }

    @Test
    void shouldGetAreaCircle() {
        // given
        int number1 = 8;
        // when
        double resultAreaCircle = new Circle(number1).getArea();
        // given
        Assertions.assertEquals(201, resultAreaCircle);
    }

    @Test
    void shouldGetPerimeterRectangle() {
        // given
        int number1 = 8;
        int number2 = 12;
        // when
        double resultPerimeterRectangle = new Rectangle(number1, number2).getPerimeter();
        // then
        Assertions.assertEquals(40, resultPerimeterRectangle);
    }

    @Test
    void shouldGetAreaRectangle() {
        // given
        int number1 = 8;
        int number2 = 12;
        // when
        double resultAreaRectangle = new Rectangle(number1, number2).getArea();
        // then
        Assertions.assertEquals(96, resultAreaRectangle);
    }
}
