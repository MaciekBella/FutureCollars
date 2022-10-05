package com.futurecollars.lesson11.zad6;

import com.futurcollars.lesson11.zad6.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WorkoutServiceTest {
    @ParameterizedTest
    @MethodSource("provideResultWorkout")
    void shouldVerifyResultWorkout(int input1, int input2, int input3, WorkoutComment expected) {
        // given
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        WorkoutLengthCalculator workoutLengthCalculator = new WorkoutLengthCalculator();
        HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
        WorkoutService workoutService = new WorkoutService(workoutLengthCalculator, heartRateCalculator, caloriesCalculator);
        // when
        WorkoutComment result = workoutService.getResultWorkout(input1, input2, input3);
        // then
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideResultWorkout() {
        return Stream.of(
                Arguments.of(65, 350, 148, WorkoutComment.DOBRA),
                Arguments.of(30, 200, 100, WorkoutComment.NISKA),
                Arguments.of(50, 400, 182, WorkoutComment.BARDZO_DOBRA),
                Arguments.of(75, 600, 180, WorkoutComment.DOSKONAŁA)
        );
    }
}
