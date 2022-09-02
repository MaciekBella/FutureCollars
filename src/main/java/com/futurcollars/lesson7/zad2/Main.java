package com.futurcollars.lesson7.zad2;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Kapitan Ameryka", "Joe Johnston", 124, 2011);
        System.out.println(movie.getTitleOfMovie());
        System.out.println(movie.getFullNameDirector());
        System.out.println(movie.getMovieTime() + " min");
        System.out.println(movie.getYearOfProductionMovie() + " roku");

    }
}
