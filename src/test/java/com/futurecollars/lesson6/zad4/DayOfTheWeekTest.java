package com.futurecollars.lesson6.zad4;

import com.futurcollars.lesson6.zad4.DayOfTheWeek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayOfTheWeekTest {

    @Test
    void shouldGetDayOfTheWeek() {
        //given
        int numberDay = 2;
        // when
        String result = DayOfTheWeek.getNameOfTheWeekDay(numberDay);
        // then
        Assertions.assertEquals("Tuesday", result);
    }
}
