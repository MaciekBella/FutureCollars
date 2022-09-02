package com.futurcollars.lesson7.zad3;

public abstract class BaseEmployee {

    private String name;
    private String surname;
    private final int yearOfEmployment;
    private final int baseSalary;
    private int bonus;

    public BaseEmployee(String name, String surname, int yearOfEmployment, int baseSalary, int bonus) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public BaseEmployee(String name, String surname, int yearOfEmployment, int baseSalary) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = baseSalary;
        this.baseSalary = baseSalary;

    }

    public int calculateMonthlySalary() {
        return baseSalary + bonus;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public int getExperience() {
        return 2022 - yearOfEmployment;
    }
}
