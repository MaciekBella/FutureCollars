package com.futurcollars.lesson12.zad1;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NameList {

    NameList() {
    }

    public List<String> getListInReverseOrder(List<String> name) {
        Collections.reverse(name);
        return name;
    }

    public Set<String> getListWithoutDuplicate(List<String> name) {
        Set<String> noDuplicate = new HashSet<>(name);
        return noDuplicate;
    }

    public List<String> replaceStringInList(List<String> name, String oldName, String newName) {
        Collections.replaceAll(name, oldName, newName);
        return name;
    }
}
