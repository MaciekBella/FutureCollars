package com.futurcollars.lesson7.zad2;

public class Movie {

    private String titleOfMovie;
    private String fullNameDirector;
    private int movieTime;
    private int yearOfProductionMovie;

    public Movie(String titleOfMovie, String fullNameDirector, int movieTime, int yearOfProductionMovie) {
        this.titleOfMovie = titleOfMovie;
        this.fullNameDirector = fullNameDirector;
        this.movieTime = movieTime;
        this.yearOfProductionMovie = yearOfProductionMovie;

    }

    public String getTitleOfMovie() {
        return titleOfMovie;
    }

    public String getFullNameDirector() {
        return fullNameDirector;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public int getYearOfProductionMovie() {
        return yearOfProductionMovie;
    }

}
