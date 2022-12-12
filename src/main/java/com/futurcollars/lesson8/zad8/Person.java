package com.futurcollars.lesson8.zad8;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int height;
    private String work;

    public Person(String name, int age, int height, String work) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.work = work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Objects.equals(name, person.name) && Objects.equals(work, person.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, work);
    }
}