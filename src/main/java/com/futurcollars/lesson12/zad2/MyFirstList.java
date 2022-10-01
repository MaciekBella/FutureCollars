package com.futurcollars.lesson12.zad2;

import java.util.Arrays;

public class MyFirstList implements OwnList {

    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] elements;

    private MyFirstList() {
        elements = new Integer[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Integer element) {
        if (size == elements.length) {
            Integer[] newElements = Arrays.copyOf(elements, size + 1);
            newElements[size + 1] = element;
            this.elements = newElements;
        } else {
            elements[size + 1] = element;
        }
        size++;
    }

    @Override
    public Integer get(int i) {
        if (i >= size || i < 0)
            throw new IndexOutOfBoundsException();
        return elements[i];
    }

    @Override
    public void add(int index, Integer element) {
        get(index);
        System.arraycopy(this.elements, index, elements, index + 1, size - index);
        elements[index] = element;
        this.size++;
    }

    @Override
    public Integer remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            Integer item = elements[index];
            int numElts = elements.length - (index + 1);
            System.arraycopy(elements, index + 1, elements, index, numElts);
            size--;
            return item;
        }
    }
}
