package com.futurecollars.lesson11.zad2;

import com.futurcollars.lesson11.zad2.UpperCaseTextFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UpperCaseTextFormatterTest {

    @ParameterizedTest
    @ValueSource(strings = {"rafał"})
    void shouldConvertToUpperCase(String input) {
        // given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter(input);
        // when
        String result = upperCaseTextFormatter.getConvertToUpperCase();
        //then
        Assertions.assertNotNull(result);
        Assertions.assertEquals("RAFAŁ", result);
    }
}
