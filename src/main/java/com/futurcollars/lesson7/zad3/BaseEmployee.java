package com.futurcollars.lesson7.zad3;

public abstract class BaseEmployee {

    private String name;
    private String surname;
    private final int yearOfEmployment;

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getExperience() {
        return 2022 - yearOfEmployment;
    }
}
