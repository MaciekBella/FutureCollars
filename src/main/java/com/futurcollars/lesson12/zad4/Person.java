package com.futurcollars.lesson12.zad4;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private int yearOfBirth;
    private int height;
    private int weight;

    public Person(String name, String surname, int yearOfBirth, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{"  +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(2022 - this.yearOfBirth, 2022 - o.yearOfBirth);
    }
}