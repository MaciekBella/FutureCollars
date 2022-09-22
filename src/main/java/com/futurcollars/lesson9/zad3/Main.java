package com.futurcollars.lesson9.zad3;

public class Main {
    public static void main(String[] args) {
        ImprovedCalculator improvedCalculator = new ImprovedCalculator(45,45);
        System.out.println(improvedCalculator.getCalculator(MathAction.SUM));
    }
}