package com.futurcollars.lesson11.zad6;

public class Main {
    public static void main(String[] args) {

        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        WorkoutLengthCalculator workoutLengthCalculator = new WorkoutLengthCalculator();
        HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
        WorkoutService workoutService = new WorkoutService(workoutLengthCalculator, heartRateCalculator, caloriesCalculator);
        System.out.println(workoutService.getResultWorkout(80, 600, 180));
    }
}

