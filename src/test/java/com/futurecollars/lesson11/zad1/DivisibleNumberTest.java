package com.futurecollars.lesson11.zad1;

import com.futurcollars.lesson11.zad1.DivisibleNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DivisibleNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 6, 12, 18})
    void shouldGetDivisibleNumber(int input) {
        // given
        DivisibleNumber divisibleNumber = new DivisibleNumber();
        // when
        boolean result = divisibleNumber.isDivisibleNumber(input);
        // then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"2:true", "4:true", "12:true"}, delimiter = ':')
    void shouldGetDivisibleNumber(int input, boolean expected) {
        // given
        DivisibleNumber divisibleNumber = new DivisibleNumber();
        // when
        boolean result = divisibleNumber.isDivisibleNumber(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
