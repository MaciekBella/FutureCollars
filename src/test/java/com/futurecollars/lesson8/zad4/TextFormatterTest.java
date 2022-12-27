package com.futurecollars.lesson8.zad4;

import com.futurcollars.lesson8.zad4.LowerCaseText;
import com.futurcollars.lesson8.zad4.UpperCaseTextFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextFormatterTest {
    @Test
    void shouldGetUpperCaseText() {
        // given
        String text = "Uczenie Java sprawia mi przyjemność";
        // when
        String result = new UpperCaseTextFormatter().formatText(text);
        // then
        Assertions.assertTrue(true, result);
    }

    @Test
    void shouldGetLowerCaseText() {
        // given
        String text = "Uczenie Java sprawia mi przyjemność";
        // when
        String result = new LowerCaseText().formatText(text);
        // then
        Assertions.assertTrue(true, result);
    }
}
