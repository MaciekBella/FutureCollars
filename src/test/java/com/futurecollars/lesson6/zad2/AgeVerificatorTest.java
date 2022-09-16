package com.futurecollars.lesson6.zad2;

import com.futurcollars.lesson6.zad2.AgeVerificator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeVerificatorTest {

    @Test
    void shouldVerifyAge() {
        // given
        int age = 14;
        // when
        boolean resultVerification = AgeVerificator.verifyAge(age);
        // then
        Assertions.assertEquals(false, resultVerification);
    }
}

