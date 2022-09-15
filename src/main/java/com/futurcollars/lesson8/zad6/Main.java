package com.futurcollars.lesson8.zad6;

public class Main {
    public static void main(String[] args) {
        short number = 3;
        BillCalculator billCalculator = new BillCalculator();
        System.out.println(billCalculator.calculate(45, 12.3f, number));
        System.out.println(billCalculator.calculate(90, 12));
        System.out.println(billCalculator.calculate(210, 2, 13));
    }
}
