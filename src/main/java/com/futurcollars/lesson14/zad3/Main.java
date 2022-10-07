package com.futurcollars.lesson14.zad3;

public class Main {
    public static void main(String[] args) {

        UrlValidator urlValidator = new UrlValidator();
        System.out.println(urlValidator.isValidateUrl("http://www.onet.pl"));
        System.out.println(urlValidator.isValidateUrl("https://mail.google.com"));
        System.out.println(urlValidator.isValidateUrl("http://wiadmosci.onet.pl"));
        System.out.println(urlValidator.isValidateUrl("http://onet.pl"));
    }
}
