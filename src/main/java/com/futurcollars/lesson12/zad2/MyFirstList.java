package com.futurcollars.lesson12.zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstList implements OwnList {

    Integer[] numberTab = {1, 23, 42, 526, 74, 2, 243, 3};
    List<Integer> numberList = new ArrayList<>(Arrays.asList(numberTab));

    @Override
    public int size() {
        return numberList.size();
    }

    @Override
    public boolean isEmpty() {
        return numberList.isEmpty();
    }

    @Override
    public void add(Integer element) {
        numberList.add(element);
    }

    @Override
    public Integer get(int i) {
        return numberList.get(i);
    }

    @Override
    public void add(int index, Integer element) {
        if (index > numberList.size()) {
            throw new ArrayIndexOutOfBoundsException("niema takiego indexu");
        } else {
            numberList.add(index, element);
        }
    }

    @Override
    public Integer remove(int index) {
        int result;
        if (index > numberList.size()) {
            throw new ArrayIndexOutOfBoundsException("niema takiego indexu");
        } else {
            result = numberList.remove(index);
        }
        return result;
    }
}
