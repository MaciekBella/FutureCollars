package com.futurcollars.lesson9.zad3;

public class ImprovedCalculator implements Calculator {


    @Override
    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public int divide(int number1, int number2) {
        return number1 / number2;
    }

    public int doCalculation(MathAction action, int number1, int number2) {
        int result;
        switch (action) {
            case SUM:
                result = sum(number1, number2);
                break;
            case SUBTRACT:
                result = subtract(number1, number2);
                break;
            case MULTIPLY:
                result = multiply(number1, number2);
                break;
            case DIVIDE:
                result = divide(number1, number2);
                break;
            default:
                throw new IllegalArgumentException("Nie ma takiej operacji");
        }
        return result;
    }
}
