package com.futurcollars.lesson12.zad1;

public class Main {
    public static void main(String[] args) {

        NameList nameList = new NameList();
        System.out.println(nameList.writeListWithoutDuplicate());
        System.out.println();
        System.out.println(nameList.writeListInReverseOrder());
        System.out.println();
        System.out.println(nameList.getOldToNewName("Anna", "Joanna"));
    }
}
