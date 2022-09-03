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
        int resultPerimeterSquare = new Square(number).getPerimeter();
        // then
        Assertions.assertEquals(32, resultPerimeterSquare);
    }

    @Test
    void shouldGetAreaSquare() {
        // given
        int number = 8;
        // when
        int resultAreaSquare = new Square(number).getArea();
        // then
        Assertions.assertEquals(64, resultAreaSquare);
    }

    @Test
    void shouldGetPerimeterTriangle() {
        // given
        int number1 = 6;
        int number2 = 8;
        int number3 = 4;
        int number4 = 8;
        // when
        int resultPerimeterTriangle = new Triangle(number1, number2, number3, number4).getPerimeter();
        // then
        Assertions.assertEquals(18, resultPerimeterTriangle);
    }

    @Test
    void shouldGetAreaTriangle() {
        // given
        int number1 = 6;
        int number2 = 8;
        int number3 = 4;
        int number4 = 8;
        // when
        int resultAreaTriangle = new Triangle(number1, number2, number3, number4).getArea();
        // then
        Assertions.assertEquals(24, resultAreaTriangle);
    }

    @Test
    void shouldGetPerimeterCircle() {
        // given
        int number1 = 8;
        // when
        int resultPerimeterCircle = new Circle(number1).getPerimeter();
        // then
        Assertions.assertEquals(50, resultPerimeterCircle);
    }

    @Test
    void shouldGetAreaCircle() {
        // given
        int number1 = 8;
        // when
        int resultAreaCircle = new Circle(number1).getArea();
        // given
        Assertions.assertEquals(201, resultAreaCircle);
    }

    @Test
    void shouldGetPerimeterRectangle() {
        // given
        int number1 = 8;
        int number2 = 12;
        // when
        int resultPerimeterRectangle = new Rectangle(number1, number2).getPerimeter();
        // then
        Assertions.assertEquals(40, resultPerimeterRectangle);
    }

    @Test
    void shouldGetAreaRectangle() {
        // given
        int number1 = 8;
        int number2 = 12;
        // when
        int resultAreaRectangle = new Rectangle(number1, number2).getArea();
        // then
        Assertions.assertEquals(96, resultAreaRectangle);
    }
}
