package com.futurcollars.lesson7.zad5;

public class RectangularTriangle {
    public static boolean getCheckRectangularTriangle(int sideA, int sideB, int sideC) {
        double sidesA = Math.pow(sideA, 2);
        double sidesB = Math.pow(sideB, 2);
        double sidesC = Math.pow(sideC, 2);
        boolean result = sidesA + sidesB == sidesC;
        System.out.println(result);
        return result;
    }
}
