package com.futurcollars.lesson11.zad5;

public interface CurrencyExchangeRate {

    double getBuyRate(Currency currency);

    double getSellRate(Currency currency);
}