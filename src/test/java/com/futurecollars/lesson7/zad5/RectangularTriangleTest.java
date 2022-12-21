package com.futurecollars.lesson7.zad5;

import com.futurcollars.lesson7.zad5.RectangularTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangularTriangleTest {

    @Test
    void shouldCheckRectangularTriangle() {
        // given
        int sideA = 6;
        int sideB = 8;
        int sideC = 10;
        // when
        boolean result = RectangularTriangle.isRectangularTriangle(sideA, sideB, sideC);
        // then
        Assertions.assertEquals(true, result);
    }
}
