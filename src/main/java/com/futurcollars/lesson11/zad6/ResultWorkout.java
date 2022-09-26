package com.futurcollars.lesson11.zad6;

public class ResultWorkout extends Workout {

    private int workoutLength;
    private int calorieBurned;
    private int pulse;

    public ResultWorkout(int workoutLength, int calorieBurned, int pulse) {
        this.calorieBurned = calorieBurned;
        this.workoutLength = workoutLength;
        this.pulse = pulse;
    }

    public String getResultWorkout() {
        double result = (getCalorieBurned(calorieBurned) + getPulse(pulse) + getWorkoutLength(workoutLength)) / 6;
        String name;
        if (result < 1.2) {
            name = "Niska";
        } else if (result >= 1.2 && result < 2) {
            name = "Dobra";
        } else if (result >= 2 && result < 3) {
            name = "Bardzo Dobra";
        } else if (result == 3) {
            name = "Doskonała";
        } else
            name = "Bład";
        return name;
    }
}
