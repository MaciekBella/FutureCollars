package com.futurecollars.lesson11.zad6;

import com.futurcollars.lesson11.zad6.ResultWorkout;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ResultWorkoutTest {

    @ParameterizedTest
    @CsvSource(value = {"3:Doskonała"}, delimiter = ':')
    void shouldGetResultWorkout(int input, String expected) {
        // given
        ResultWorkout resultWorkout = new ResultWorkout(61, 400, 400);
        // when
        String result = resultWorkout.getResultWorkout();
        // then
        Assertions.assertEquals(expected, result);
    }
}
