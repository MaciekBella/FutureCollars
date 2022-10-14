package com.futurecollars.lesson11.zad6;

import com.futurcollars.lesson11.zad6.CaloriesCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaloriesCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"290:2", "355:4", "401:6"}, delimiter = ':')
    void shouldGetCalorieBurned(int input, int expected) {
        // given
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        // when
        double result = caloriesCalculator.getCalorieBurned(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
