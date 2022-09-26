package com.futurcollars.lesson12.zad1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NameList {

    NameList() {
    }

    List<String> name = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");

    public List<String> writeListInReverseOrder() {
        Collections.reverse(name);
        return name;
    }

    public List<String> writeListWithoutDuplicate() {
        return name.stream().distinct().collect(Collectors.toList());
    }

    public List<String> getOldToNewName(String oldName, String newName) {
        name.set(name.indexOf(oldName), newName);
        name.set(name.indexOf(oldName), newName);
        return name;
    }
}
