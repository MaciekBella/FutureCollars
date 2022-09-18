package com.futurcollars.lesson9.zad3;

public class ImprovedCalculator {

    private int number1;
    private int number2;

    ImprovedCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sum() {
        System.out.println(number1 + number2);
        return number1 + number2;
    }

    public int subtract() {
        System.out.println(number1 - number2);
        return number1 - number2;
    }

    public int multiply() {
        System.out.println(number1 * number2);
        return number1 * number2;
    }

    public int divide() {
        System.out.println(number1 / number2);
        return number1 / number2;
    }
}
