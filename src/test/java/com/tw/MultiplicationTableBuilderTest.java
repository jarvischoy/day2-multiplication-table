package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertTrue(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_0() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 0;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 1001;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerThanEnd_given_a_starter_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 2;
        int end = 3;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(starter, end);

        // Then
        assertTrue(isStarterNotBiggerThanEnd);
    }

    @Test
    void should_return_false_when_isStarterNotBiggerThanEnd_given_a_starter_3_and_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 3;
        int end = 2;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(starter, end);

        // Then
        assertFalse(isStarterNotBiggerThanEnd);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerThanEnd_given_a_starter_3_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 3;
        int end = 3;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(starter, end);

        // Then
        assertTrue(isStarterNotBiggerThanEnd);
    }

    @Test
    void should_return_true_when_isValid_given_a_starter_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 2;
        int end = 3;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(starter, end);

        // Then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_starter_2_and_end_1() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 2;
        int end = 1;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(starter, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_starter_0_and_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 0;
        int end = 2;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(starter, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_starter_2_and_end_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 1001;
        int end = 2;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(starter, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_expression_when_generateExpression_given_a_starter_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 2;
        int end = 3;

        // When
        String expression = multiplicationTableBuilder.generateExpression(starter, end);

        // Then
        String expectedExpression = "2*3=6";

        assertEquals(expectedExpression, expression);
    }

    @Test
    void should_return_multiplicationTable_when_generateTable_given_a_starter_2_and_end_4() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int starter = 2;
        int end = 4;

        // When
        String multiplicationTable = multiplicationTableBuilder.generateTable(starter, end);

        // Then
        String expectedMultiplicationTable = String.format("2*2=4%n2*3=6 3*3=9%n2*4=8 3*4=12 4*4=16%n");

        assertEquals(expectedMultiplicationTable, multiplicationTable);
    }
}
