package com.futurecollars.lesson14.zad2;

import com.futurcollars.lesson14.zad2.PeselValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PeselValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {"12345678911:True", "121354:False", "sfadf:False"}, delimiter = ':')
    void shouldVerifyValidatePesel(String input, boolean expected) {
        // given
        PeselValidator peselValidator = new PeselValidator();
        // when
        boolean result = peselValidator.isValidatePesel(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
