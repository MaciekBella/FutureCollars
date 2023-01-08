package com.futurcollars.lesson14.zad3;

public class Main {
    public static void main(String[] args) {

        UrlValidator urlValidator = new UrlValidator();
        System.out.println(urlValidator.isValid("http://www.onet.pl"));
        System.out.println(urlValidator.isValid("https://mail.google.com"));
        System.out.println(urlValidator.isValid("http://wiadmosci.onet.pl"));
        System.out.println(urlValidator.isValid("http://onet.pl"));
    }
}
