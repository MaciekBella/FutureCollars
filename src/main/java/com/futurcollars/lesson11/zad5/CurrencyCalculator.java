package com.futurcollars.lesson11.zad5;

public class CurrencyCalculator {

    private final CurrencyExchangeRate currencyExchangeRate;

    public CurrencyCalculator(CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
    }

    public double calculateExchangeBuy(double amount, Currency outputCurrency) {
        double exchangeRate = currencyExchangeRate.getBuyRate(outputCurrency);
        return amount * exchangeRate;
    }
    public double calculateExchangeSell(double amount, Currency inputCurrency) {
        double exchangeRate = currencyExchangeRate.getSellRate(inputCurrency);
        return amount * exchangeRate;
    }
}
