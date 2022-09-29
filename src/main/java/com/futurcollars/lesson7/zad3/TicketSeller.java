package com.futurcollars.lesson7.zad3;

public class TicketSeller extends BaseEmployee {
    private final int baseSalary;

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
        this.baseSalary = 3000;
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}