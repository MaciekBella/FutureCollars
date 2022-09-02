package com.futurecollars.lesson7.zad4;

import com.futurcollars.lesson7.zad4.ConvertMinuteToSecond;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterMinuteToSecondTest {

    @Test
    void shouldConverterMinuteToSecond() {
        // given
        int number = 15;
        // when
        int resultConverterMinuteToSecond = ConvertMinuteToSecond.getConverterMinutesToSecond(number);
        // then
        Assertions.assertEquals(900, resultConverterMinuteToSecond);
    }
}
