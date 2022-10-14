package com.futurecollars.lesson14.zad5;

import com.futurcollars.lesson14.zad5.PasswordValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PasswordValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {"Kamilek2022:True", "kamilek2022:Fasle",
            "Kamilek2021:False"}, delimiter = ':')
    void shouldVerifyTheCorrectnessOfThePassword(String input, boolean expected) {
        // given
        PasswordValidator passwordValidator = new PasswordValidator();
        // when
        boolean result = passwordValidator.isValid(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
