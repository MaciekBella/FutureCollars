package com.futurecollars.lesson8.zad4;

import com.futurcollars.lesson8.zad4.UpperCaseTextFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpperCaseTextFormatterTest {

    @Test
    void shouldGetUpperCaseText() {
        // given
        String text = "UCZENIE JAVA SPRAWIA MI PRZYJEMNOŚĆ";
        // when
        String result = new UpperCaseTextFormatter().formatText(text);
        // then
        Assertions.assertEquals("UCZENIE JAVA SPRAWIA MI PRZYJEMNOŚĆ", result);
    }
}
