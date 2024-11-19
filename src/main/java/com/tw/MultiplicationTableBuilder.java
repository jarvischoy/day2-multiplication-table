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

    public String generateExpression(int starter, int end) {
        return String.format("%d*%d=%d", starter, end, starter * end);
    }

    public String generateTable(int starter, int end) {
        StringBuilder multiplicationTable = new StringBuilder();

        for (int i = starter; i <= end; i++) {
            for (int j = starter; j <= i; j++) {
                multiplicationTable.append(generateExpression(j, i));
                if (j != i) {
                    multiplicationTable.append(" ");
                }
            }
            multiplicationTable.append(System.lineSeparator());
        }

        return multiplicationTable.toString();
    }
}
