package com.futurecollars.lesson11.zad6;

import com.futurcollars.lesson11.zad6.HeartRateCalculator;
import com.futurcollars.lesson11.zad6.Workout;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HeartRateCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"150:3", "165:6", "180:9"}, delimiter = ':')
    void shouldGetPulse(int input, int expected) {
        // given
        HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
        // when
        double result = heartRateCalculator.getPulse(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
