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
        boolean result = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public int getLength() {
        return text.length();
    }

    public void textVerify() {
        if (!isEmpty()) {
            System.out.println(isPalindrome());
            System.out.println(getLength());
        } else {
            System.out.println("Zepsuło sie ");
        }
        return;
    }
}
