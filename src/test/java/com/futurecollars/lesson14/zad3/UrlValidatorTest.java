package com.futurecollars.lesson14.zad3;

import com.futurcollars.lesson14.zad3.UrlValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UrlValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {"http://www.onet.pl*True", "https://mail.google.com*True",
            "http://wiadmosci.onet.pl*True", "http://onet.pl*True"}, delimiter = '*')
    void shouldVerifyValidateUrl(String input, boolean expected) {
        // given
        UrlValidator urlValidator = new UrlValidator();
        // when
        boolean result = urlValidator.isValid(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
