package com.futurecollars.lesson6.zad3;

import com.futurcollars.lesson6.zad3.EvenOrOddNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenOrOddNumbersTest {
    @Test
    void shouldCheckIsEvenNumber() {
        // given
        int number = 20;
        // when
        boolean resultEvenNumbers = EvenOrOddNumbers.isEvenNumber(number);
        // then
        Assertions.assertEquals(true, resultEvenNumbers);
    }

    @Test
    void shouldCheckIsOddNumber() {
        // given
        int number = 69;
        // when
        boolean resultOddNumbers = EvenOrOddNumbers.isOddNumber(number);
        //then
        Assertions.assertEquals(true, resultOddNumbers);
    }
}
