package com.futurcollars.lesson7.zad1;

public class PlaceInCinemaHall {

    private final int numberPlace;
    private final int rowNumber;
    private boolean isFreePlace;

    public PlaceInCinemaHall(int numberPlace, int rowNumber, boolean isFreePlace) {
        this.numberPlace = numberPlace;
        this.rowNumber = rowNumber;
        this.isFreePlace = isFreePlace;
    }

    public int getNumberPlace() {
        return numberPlace;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isFreePlace() {
        return isFreePlace;
    }
}