package com.futurcollars.lesson12.zad4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Person {

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

    public Person() {
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

    public void getComparisonOfThePersonWeight() {
        Set<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.weight, o2.weight);
            }
        });
        people.add(new Person("Marek", "Kot", 2002, 175, 56));
        people.add(new Person("Jacek", "Czerniak", 1999, 170, 80));
        people.add(new Person("Jas", "Ślepy", 1998, 188, 65));
        people.add(new Person("Marysia", "Kowalska", 1956, 189, 67));
        people.add(new Person("Monika", "Mela", 2005, 155, 45));
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getYearOfBirth() + " "
                    + person.getHeight() + " " + person.getWeight());
        }
    }

    public void getComparisonOfThePersonHeight() {
        Set<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.height, o2.height);
            }
        });
        people.add(new Person("Marek", "Kot", 2002, 175, 56));
        people.add(new Person("Jacek", "Czerniak", 1999, 170, 80));
        people.add(new Person("Jas", "Ślepy", 1998, 188, 65));
        people.add(new Person("Marysia", "Kowalska", 1956, 189, 67));
        people.add(new Person("Monika", "Mela", 2005, 155, 45));
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getYearOfBirth() + " "
                    + person.getHeight() + " " + person.getWeight());
        }
    }

    public void getComparisonOfThePersonBirthday() {
        Set<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.yearOfBirth, o2.yearOfBirth);
            }
        });
        people.add(new Person("Marek", "Kot", 2002, 175, 56));
        people.add(new Person("Jacek", "Czerniak", 1999, 170, 80));
        people.add(new Person("Jas", "Ślepy", 1998, 188, 65));
        people.add(new Person("Marysia", "Kowalska", 1956, 189, 67));
        people.add(new Person("Monika", "Mela", 2005, 155, 45));
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getYearOfBirth() + " "
                    + person.getHeight() + " " + person.getWeight());
        }
    }
}
