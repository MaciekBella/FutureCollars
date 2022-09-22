package com.futurcollars.lesson9.zad3;

public class ImprovedCalculator implements Calculator {
    private int number1;
    private int number2;

    public ImprovedCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int sum() {
        return number1 + number2;
    }

    @Override
    public int subtract() {
        return number1 - number2;
    }

    @Override
    public int multiply() {
        return number1 * number2;
    }

    @Override
    public int divide() {
        return number1 / number2;
    }

    public int getCalculator(MathAction asd) {
        int result;
        switch (asd) {
            case SUM:
                result = sum();
                break;
            case SUBTRACT:
                result = subtract();
                break;
            case MULTIPLY:
                result = multiply();
                break;
            case DIVIDE:
                result = divide();
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
