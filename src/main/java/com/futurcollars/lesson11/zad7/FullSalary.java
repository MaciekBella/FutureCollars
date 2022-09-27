package com.futurcollars.lesson11.zad7;

public class FullSalary implements BasicSalary, SaturdaySalary {
    public FullSalary() {

    }

    @Override
    public int getBasicSalary(int basicSalary) {
        return basicSalary;
    }

    @Override
    public int getAmountSaturday(int amount) {
        return amount;
    }

    public int getFullPay(int basicSalary, int bonusSalary, int amountSaturday, int numberSaturday) {
        return (getBasicSalary(basicSalary) + bonusSalary) + (getAmountSaturday(amountSaturday) * numberSaturday);
    }
}
