package com.futurcollars.lesson9.zad4;

import java.math.BigDecimal;

public class EmployeeCorrect {
    private String name;
    private String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public EmployeeCorrect(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public EmployeeCorrect(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public EmployeeCorrect(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.surname = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public EmployeeCorrect(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this.name = name;
        this.surname = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;

    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    public static final String WHITE_SPACE = " ";

    // Method is used to get total  salary
    public BigDecimal getBaseSalaryAddBonus() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

}