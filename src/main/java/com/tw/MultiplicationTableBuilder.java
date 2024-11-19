package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 0 && number <= 1000;
    }

    public boolean isStarterNotBiggerThanEnd(int starter, int end) {
        return starter <= end;
    }

    public boolean isValid(int starter, int end) {
        return isInRange(starter) && isInRange(end) && isStarterNotBiggerThanEnd(starter, end);
    }

    public String generateExpression(int starter, int end) {
        return String.format("%d*%d=%d", starter, end, starter * end);
    }

    public String generateTable(int starter, int end) {
        return IntStream.rangeClosed(starter, end)
                .mapToObj(i -> IntStream.rangeClosed(starter, i)
                        .mapToObj(j -> generateExpression(j, i))
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.joining(System.lineSeparator()))
                .concat(System.lineSeparator());
    }
}
