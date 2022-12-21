package com.futurecollars.lesson7.zad4;

import com.futurcollars.lesson7.zad4.TimeConverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeConverterTest {

    @Test
    void shouldConvertMinutesToSecond() {
        // given
        int number = 15;
        // when
        int result = TimeConverter.convertMinutesToSeconds(number);
        // then
        Assertions.assertEquals(900, result);
    }
}
