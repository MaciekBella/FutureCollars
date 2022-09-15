package com.futurecollars.lesson8.zad3;

import com.futurcollars.lesson8.zad3.Circle;
import com.futurcollars.lesson8.zad3.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaAndPerimeterTest {

    @Test
    void shouldGetAreaSquare() {
        // given
        int number = 6;
        // when
        double resultArea = new Square(number).getArea();
        // then
        Assertions.assertEquals(36, resultArea);
    }

    @Test
    void shouldGetPerimeterSquare() {
        // given
        int number = 6;
        // when
        double resultPerimeter = new Square(number).getPerimeter();
        // then
        Assertions.assertEquals(24, resultPerimeter);
    }

    @Test
    void shouldGetAreaCircle() {
        // given
        int number = 3;
        // when
        double resultArea = new Circle(number).getArea();
        // then
        Assertions.assertEquals(28, resultArea);
    }

    @Test
    void shouldGetPerimeterCircle() {
        // given
        int number = 3;
        // when
        double resultPerimeter = new Circle(number).getPerimeter();
        // then
        Assertions.assertEquals(18, resultPerimeter);
    }
}
