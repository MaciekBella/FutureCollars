package com.futurcollars.lesson7.zad2;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Kapitan Ameryka", "Joe Johnston", 124, 2011);
        System.out.println(movie.getTitle());
        System.out.println(movie.getDirectorName());
        System.out.println(movie.getDuration() + " min");
        System.out.println(movie.getYearOfRelease() + " roku");

    }
}
