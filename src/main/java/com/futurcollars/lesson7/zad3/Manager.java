package com.futurcollars.lesson7.zad3;

public class Manager extends BaseEmployee {
    private final int baseSalary;
    private int bonus;

    public Manager(String name, String surname, int yearOfEmployment, int bonus) {
        super(name, surname, yearOfEmployment);
        this.baseSalary = 5000;
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary + bonus;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
