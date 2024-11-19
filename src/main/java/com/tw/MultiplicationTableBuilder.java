package com.tw;

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
}
