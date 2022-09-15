package com.futurcollars.lesson8.zad8;

public class Main {
    public static void main(String[] args) {
        Person kamil = new Person("Kamil", 18, 180, "Transport");
        Person kamilS = new Person("kamil", 18, 180, "Transport");
        Person andrzej = new Person("Andrzej", 24, 179, "Programista");

        System.out.println(kamil.hashCode(kamilS));
        System.out.println(kamilS.equals(andrzej));
    }
}
