package com.futurcollars.lesson14.zad2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {

    public boolean isValid(String numberPesel) {
        Pattern pattern = Pattern.compile("^\\d{11}$");
        Matcher matcher = pattern.matcher(numberPesel);
        return matcher.matches();
    }
}
