package com.futurcollars.lesson9.zad1;

public class Main {
    public static void main(String[] args) {
        TextInFormat textInformat = new TextInFormat("radar");
        System.out.println(textInformat.isEmpty());
        System.out.println(textInformat.isPalindrome());
        System.out.println(textInformat.isLength());
    }
}
