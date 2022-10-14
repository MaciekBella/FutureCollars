package com.futurcollars.lesson15.zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> menu = Arrays.asList(
                new Pizza("Neapolitańska", false, 522, List.of("salami", "mozarella", "seler")),
                new Pizza("Sycylijska", true, 350, List.of("mozarella", "pieczarki", "seler")),
                new Pizza("Kalifornijska", false, 410, List.of("pieczarki", "pomidor", "salami")),
                new Pizza("Capricciosa", false, 652, List.of("salami", "papryka", "cabula")),
                new Pizza("Margherita", true, 523, List.of("mozarella", "pomidor", "papryka")),
                new Pizza("Pepperoni", false, 750, List.of("salami", "papryka", "seler")),
                new Pizza("Hawajska", false, 640, List.of("pieczarki", "salami", "pomidor")),
                new Pizza("nowojorska", true, 465, List.of("papryka", "seler", "mozarella")),
                new Pizza("Diavola", false, 265, List.of("mozarella", "cabula", "papryka")),
                new Pizza("Ortolana", true, 135, List.of("pieczarki", "cabula", "pomidor")));
        Pizza.getAllVegetarianPizzas(menu);
        System.out.println();
        Pizza.getAllPizzasWithCelery(menu);
        System.out.println();
        System.out.println(Pizza.checkIsVeganAndContainsTomatoAndPepper(menu));
        System.out.println();
        System.out.println(Pizza.checkAllDishContainsMozzarella(menu));
        System.out.println();
        Pizza.getPizzaWithHighestCalorie(menu);
        System.out.println();
        Pizza.getPizzaWithTheLowestCalorie(menu);
    }
}
