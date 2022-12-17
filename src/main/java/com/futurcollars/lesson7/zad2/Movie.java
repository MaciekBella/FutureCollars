package com.futurcollars.lesson7.zad2;

public class Movie {

    private String title;
    private final String directorName;
    private final int duration;
    private final int yearOfRelease;

    public Movie(String title, String directorName, int duration, int yearOfRelease) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.yearOfRelease = yearOfRelease;

    }

    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getDuration() {
        return duration;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

}
