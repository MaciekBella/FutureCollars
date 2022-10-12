package com.futurcollars.lesson14.zad2;

public class Main {
    public static void main(String[] args) {

        PeselValidator peselValidator = new PeselValidator();
        System.out.println(peselValidator.isValid("12345678911"));
    }
}
