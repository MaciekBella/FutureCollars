package com.futurcollars.lesson14.zad3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public boolean isValidateUrl(String url) {
        Pattern pattern = Pattern.compile("^(https?|http)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
