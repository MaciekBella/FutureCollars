package com.futurecollars.lesson11.zad2;

import com.futurcollars.lesson11.zad2.UpperCaseTextFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class UpperCaseTextFormatterTest {

    @ParameterizedTest
    @ValueSource(strings = {"rafał"})
    void shouldConvertToUpperCase(String input) {
        // given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        // when
        String result = upperCaseTextFormatter.convertToUpperCase(input);
        //then
        Assertions.assertEquals("RAFAŁ", result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnEmptyStringWhenNullOrEmpty(String input) {
        // given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        // when
        String result = upperCaseTextFormatter.convertToUpperCase(input);
        //then
        Assertions.assertEquals("", result);
    }
}