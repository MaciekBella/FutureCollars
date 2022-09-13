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

    public String getTitleOfMovie() {
        return title;
    }

    public String getFullNameDirector() {
        return directorName;
    }

    public int getMovieTime() {
        return duration;
    }

    public int getYearOfProductionMovie() {
        return yearOfRelease;
    }

}
