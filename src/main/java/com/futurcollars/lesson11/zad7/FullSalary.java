package com.futurcollars.lesson11.zad7;

public class FullSalary {

    private BasicSalary basicSalary;
    private SaturdaySalary saturdaySalary;

    public FullSalary(BasicSalary basicSalary, SaturdaySalary saturdaySalary) {
        this.basicSalary = basicSalary;
        this.saturdaySalary = saturdaySalary;
    }

    public int getFullPay(int bonusSalary, int numberSaturday) {
        return basicSalary.getBasicSalary() + bonusSalary + saturdaySalary.getAmountSaturday() * numberSaturday;
    }
}
