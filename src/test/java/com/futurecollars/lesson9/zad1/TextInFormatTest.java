package com.futurecollars.lesson9.zad1;

import com.futurcollars.lesson9.zad1.TextInFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextInFormatTest {

    @Test
    void shouldIsEmpty() {
        // given
        String text = "radar";
        // when
        boolean result = new TextInFormat(text).isEmpty();
        // then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldIsPalindrome() {
        // given
        String text = "kajak";
        // when
        boolean result = new TextInFormat(text).isPalindrome();
        // then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldGetLength() {
        // given
        String text = "kajak";
        // when
        int result = new TextInFormat(text).getLength();
        // then
        Assertions.assertEquals(5, result);
    }
}
