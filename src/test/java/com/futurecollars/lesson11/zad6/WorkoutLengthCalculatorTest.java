package com.futurecollars.lesson11.zad6;

import com.futurcollars.lesson11.zad6.WorkoutLengthCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkoutLengthCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"25:1", "45:2", "70:3"}, delimiter = ':')
    void shouldGetWorkoutLength(int input, int expected) {
        // given
        WorkoutLengthCalculator workoutLengthCalculator = new WorkoutLengthCalculator();
        // when
        double result = workoutLengthCalculator.getWorkoutLength(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
