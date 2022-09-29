package com.futurecollars.lesson11.zad3;

import com.futurcollars.lesson11.zad3.TextLengthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TextLengthServiceTest {

    @ParameterizedTest
    @MethodSource("provideStringForLength")
    void shouldReturnTextLength(String input, int expected) {
        // given
        TextLengthService textLengthService = new TextLengthService();
        // when
        int result = textLengthService.CheckTheLengthOfTheText(input);
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
