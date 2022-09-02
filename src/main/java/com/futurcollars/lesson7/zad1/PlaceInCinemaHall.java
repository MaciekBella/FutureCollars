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

    public final int getNumberPlace() {
        return numberPlace;
    }

    public final int getRowNumber() {
        return rowNumber;
    }

    public boolean isFreePlace() {
        return isFreePlace;
    }
}





