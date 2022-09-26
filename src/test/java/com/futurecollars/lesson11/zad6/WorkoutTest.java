package com.futurecollars.lesson11.zad6;

import com.futurcollars.lesson11.zad6.Workout;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkoutTest {

    @ParameterizedTest
    @CsvSource(value = {"290:2", "355:4", "401:6"}, delimiter = ':')
    void shouldGetCalorieBurned(int input, int expected) {
        // given
        Workout workout = new Workout();
        // when
        double result = workout.getCalorieBurned(input);
        // then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"150:3", "165:6", "180:9"}, delimiter = ':')
    void shouldGetPulse(int input, int expected) {
        // given
        Workout workout = new Workout();
        // when
        double result = workout.getPulse(input);
        // then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"25:1", "45:2", "70:3"}, delimiter = ':')
    void shouldGetWorkoutLength(int input, int expected) {
        // given
        Workout workout = new Workout();
        // when
        double result = workout.getWorkoutLength(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
