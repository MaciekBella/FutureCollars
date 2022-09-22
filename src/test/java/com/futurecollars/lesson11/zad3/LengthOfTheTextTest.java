package com.futurecollars.lesson11.zad3;

import com.futurcollars.lesson11.zad3.LengthOfTheText;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LengthOfTheTextTest {

    @ParameterizedTest
    @MethodSource("provideStringForLength")
    void shouldVerifyTextForLength(String input, int expected) {
        // given
        LengthOfTheText lengthOfTheText = new LengthOfTheText(input);
        // when
        int result = lengthOfTheText.CheckTheLengthOfTheText();
        // then
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideStringForLength() {
        return Stream.of(
                Arguments.of("Dzisiaj są moje urodziny", "24"),
                Arguments.of("Java jest najlepsza", "19"),
                Arguments.of(" Dzisiaj jest ładna pogoda ", "27")
        );
    }
}
