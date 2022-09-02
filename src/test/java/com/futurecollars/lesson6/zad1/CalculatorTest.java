package com.futurecollars.lesson6.zad1;

import com.futurcollars.lesson6.zad1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void shouldAddTwoValues() {
        // given
        int number1 = 65;
        int number2 = 54;
        // when
        int sum = Calculator.sum(number1, number2);
        // then
        Assertions.assertEquals(119, sum);
    }

    @Test
    void shouldSubtractTwoValues() {
        // given
        int number1 = 86;
        int number2 = 62;
        // when
        int subtraction = Calculator.subtract(number1, number2);
        // then
        Assertions.assertEquals(24, subtraction);
    }

    @Test
    void shouldMultiplyTwoValues() {
        // given
        int number1 = 95;
        int number2 = 36;
        // when
        int multiplication = Calculator.multiply(number1, number2);
        // then
        Assertions.assertEquals(3420, multiplication);
    }

    @Test
    void shouldDivideTwoValues() {
        // given
        int number1 = 290;
        int number2 = 9;
        // when
        int divide = Calculator.divide(number1, number2);
        // then
        Assertions.assertEquals(32, divide);
    }
}

