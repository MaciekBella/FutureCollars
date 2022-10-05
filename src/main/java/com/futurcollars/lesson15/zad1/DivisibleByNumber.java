package com.futurcollars.lesson15.zad1;

import java.util.Collection;
import java.util.stream.IntStream;

public class DivisibleByNumber {
    public Collection<Integer> GetARangeOfNumbersDivisibleByThree(int start, int end) {
        return IntStream.range(start, end)
                .filter(n -> n % 3 == 0)
                .

    }
}
