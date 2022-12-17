package com.futurcollars.lesson7.zad1;

public class Main {
    public static void main(String[] args) {

        PlaceInCinemaHall placeInCinemaHall = new PlaceInCinemaHall(15, 2, true);
        System.out.println(placeInCinemaHall.getNumberPlace() + "\n" + placeInCinemaHall.getRowNumber() +
                "\n" + placeInCinemaHall.isFreePlace());
    }
}