package com.futurcollars.lesson15.zad2;

import java.util.Comparator;
import java.util.List;

public class Pizza {

    private String namePizza;
    private boolean isVegan;
    private int calories;
    private List<String> ingredients;

    public Pizza(String namePizza, boolean isVegan, int calories, List<String> ingredients) {
        this.namePizza = namePizza;
        this.isVegan = isVegan;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public String getNamePizza() {
        return namePizza;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static void printIsVegetarian(List<Pizza> menu) {
        menu
                .stream()
                .filter(x -> x.isVegan)
                .map(Pizza::getNamePizza)
                .forEach(System.out::println);
    }

    public static void printContainsCelery(List<Pizza> menu) {
        menu
                .stream()
                .filter(x -> x.getIngredients().contains("seler"))
                .map(Pizza::getNamePizza)
                .forEach(System.out::println);
    }

    public static boolean checkIsVeganAndContainsTomatoAndPepper(List<Pizza> menu) {
        return menu
                .stream()
                .anyMatch(x -> x.isVegan && x.getIngredients().contains("pomidor") && x.getIngredients().contains("papryka"));
    }

    public static boolean checkAllDishContainsMozzarella(List<Pizza> menu) {
        return menu
                .stream()
                .allMatch(x -> x.getIngredients().contains("mozarella"));
    }

    public static void getPizzaWithHighestCalorie(List<Pizza> menu) {
        Pizza pizza = menu
                .stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println(pizza.getNamePizza());
    }

    public static void getPizzaWithTheLowestCalorie(List<Pizza> menu) {
        Pizza pizza = menu
                .stream()
                .min(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println(pizza.getNamePizza());
    }
}
