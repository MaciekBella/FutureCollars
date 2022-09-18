package com.futurcollars.lesson9.zad1;

public class TextInFormat {

    private String text;

    public TextInFormat(String text) {

        this.text = text;
    }

    public boolean isEmpty() {
        return text.isEmpty();
    }

    public boolean isPalindrome() {
        boolean truefalse = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                truefalse = false;

            } else {
                truefalse = true;
            }
        }
        return truefalse;
    }

    public int isLength() {
        return text.length();
    }
}
