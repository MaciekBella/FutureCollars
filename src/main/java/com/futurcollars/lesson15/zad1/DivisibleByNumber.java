package com.futurcollars.lesson15.zad1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleByNumber {

    public List<Integer> getARangeOfNumbersDivisibleByThree(int start, int end) {
        return IntStream.range(start, end)
                .filter(n -> n % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
