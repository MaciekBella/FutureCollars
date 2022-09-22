package com.futurecollars.lesson11.zad1;

import com.futurcollars.lesson11.zad1.DivisibleNumber;
import com.futurcollars.lesson11.zad1.SumOfGivenNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SumOfGivenNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {445, 553, 643})
    void shouldGetSumOfGivenNumber(int input) {
        // given
        SumOfGivenNumber sumOfGivenNumber = new SumOfGivenNumber();
        // when
        int result = sumOfGivenNumber.getSumOfGivenNumber(input);
        // then
        Assertions.assertEquals(13, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"456:15", "896:23", "8746:25", "464654:29"}, delimiter = ':')
    void shouldGetSumOfGivenNumber(int input, int expected) {
        // given
        SumOfGivenNumber sumOfGivenNumber = new SumOfGivenNumber();
        // when
        int result = sumOfGivenNumber.getSumOfGivenNumber(input);
        // then
        Assertions.assertEquals(expected, result);
    }
}
