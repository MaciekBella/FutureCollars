package com.futurcollars.lesson12.zad4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Marek", "Kot", 2002, 175, 56),
                new Person("Jacek", "Czerniak", 1999, 170, 80),
                new Person("Jas", "Ślepy", 1998, 188, 65),
                new Person("Marysia", "Kowalska", 1956, 189, 67),
                new Person("Monika", "Mela", 2005, 155, 45));

        printPeopleByWeight(people);
        System.out.println();
        printPeopleYearOfBirth(people);
        System.out.println();
        printPeopleByHeight(people);
    }

    public static void printPeopleByWeight(List<Person> people) {
        Set<Person> peopleByWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.getWeight(), o1.getWeight());
            }
        });
        peopleByWeight.addAll(people);
        for (Person person : peopleByWeight) {
            System.out.println(person.toString());
        }
    }

    public static void printPeopleByHeight(List<Person> people) {
        Set<Person> peopleByHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
        peopleByHeight.addAll(people);
        for (Person person : peopleByHeight) {
            System.out.println(person);
        }
    }

    public static void printPeopleYearOfBirth(List<Person> people) {
        Set<Person> peopleByYearOfBirth = new TreeSet<>();
        peopleByYearOfBirth.addAll(people);
        for (Person person : peopleByYearOfBirth) {
            System.out.println(person);
        }
    }
}
