package com.futurcollars.lesson14.zad5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public boolean isValid(String password) {
        Pattern pattern = Pattern.compile("^(?!.*2021)(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{7,20}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
