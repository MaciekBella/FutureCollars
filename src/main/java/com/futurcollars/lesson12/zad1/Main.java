package com.futurcollars.lesson12.zad1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");
        NameList nameList = new NameList();
        System.out.println(nameList.getListWithoutDuplicate(name));
        System.out.println();
        System.out.println(nameList.getListInReverseOrder(name));
        System.out.println();
        System.out.println(nameList.replaceStringInList(name, "Anna", "Joanna"));
    }
}
