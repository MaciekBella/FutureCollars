package com.futurecollars.lesson6.zad4;

import com.futurcollars.lesson6.zad4.DaysOfTheWeek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysOfTheWeekTest {

    @Test
    void shouldGetDaysofTheWeek(){
        //given
        int numberDay = 4;
        // when
        String resultDayNumber = DaysOfTheWeek.getNameOfTheWeekDay(numberDay);
        // then
        Assertions.assertEquals("Monday",resultDayNumber);
    }
}
