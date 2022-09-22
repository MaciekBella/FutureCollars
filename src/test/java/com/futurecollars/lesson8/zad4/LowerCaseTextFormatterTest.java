package com.futurecollars.lesson8.zad4;

import com.futurcollars.lesson8.zad4.LowerCaseTextFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LowerCaseTextFormatterTest {
    @Test
    void shouldGetLowerCaseText() {
        // given
        String text = "uczenie java sprawia mi przyjemność";
        // when
        String result = new LowerCaseTextFormatter().formatText(text);
        // then
        Assertions.assertEquals("uczenie java sprawia mi przyjemność", result);
    }
}
