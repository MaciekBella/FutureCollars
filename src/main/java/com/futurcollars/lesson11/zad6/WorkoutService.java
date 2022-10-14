package com.futurcollars.lesson11.zad6;

public class WorkoutService {

    private final WorkoutLengthCalculator workoutLengthCalculator;
    private final HeartRateCalculator heartRateCalculator;
    private final CaloriesCalculator caloriesCalculator;

    public WorkoutService(WorkoutLengthCalculator workoutLengthCalculator, HeartRateCalculator heartRateCalculator, CaloriesCalculator caloriesCalculator) {
        this.workoutLengthCalculator = workoutLengthCalculator;
        this.heartRateCalculator = heartRateCalculator;
        this.caloriesCalculator = caloriesCalculator;
    }

    public WorkoutComment getResultWorkout(int workoutLength, int calorieBurned, int pulse) {
        double result = (workoutLengthCalculator.getWorkoutLength(workoutLength)
                + caloriesCalculator.getCalorieBurned(calorieBurned) + heartRateCalculator.getPulse(pulse)) / 6;
        WorkoutComment workoutComment;
        if (result < 1.2) {
            workoutComment = WorkoutComment.NISKA;
        } else if (result >= 1.2 && result < 2) {
            workoutComment = WorkoutComment.DOBRA;
        } else if (result >= 2 && result < 3) {
            workoutComment = WorkoutComment.BARDZO_DOBRA;
        } else if (result == 3) {
            workoutComment = WorkoutComment.DOSKONAŁA;
        } else {
            workoutComment = WorkoutComment.BŁĄD;
        }
        return workoutComment;
    }
}
