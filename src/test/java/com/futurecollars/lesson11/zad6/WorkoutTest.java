package com.futurecollars.lesson11.zad6;

import com.futurcollars.lesson11.zad6.WorkoutService;
import com.futurcollars.lesson11.zad6.WorkoutComment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class WorkoutTest {
    @ParameterizedTest
    @EnumSource(value = WorkoutComment.class, names = {"BARDZO_DOBRA"})
    void shouldGetResultWorkout(WorkoutComment workoutComment) {
        int workoutLength = 65;
        int calorieBurned = 350;
        int pulse = 178;
        // given
        WorkoutService workoutService = new WorkoutService();
        // when
        WorkoutComment result = workoutService.getResultWorkout(workoutLength, calorieBurned, pulse);
        Assertions.assertEquals(workoutComment, result);
    }
}