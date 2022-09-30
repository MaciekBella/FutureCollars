package com.futurcollars.lesson11.zad6;

public class Workout {

    WorkoutLengthCalculator workoutLengthCalculator = new WorkoutLengthCalculator();
    HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
    CaloriesCalculator caloriesCalculator = new CaloriesCalculator();

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
            workoutComment = WorkoutComment.BARDZO_DOBRA;
        } else {
            workoutComment = WorkoutComment.BŁĄD;
        }
        return workoutComment;
    }
}
