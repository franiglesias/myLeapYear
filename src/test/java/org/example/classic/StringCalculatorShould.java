package org.example.classic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorShould {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void defaultToZero() {
        assertEquals(0, stringCalculator.Add(""));
    }

    @Test
    void sumOnlyOneNumber() {
        assertEquals(4, stringCalculator.Add("4"));
        assertEquals(22, stringCalculator.Add("22"));
    }

    @Test
    void sumTwoNumbers() {
        assertEquals(7, stringCalculator.Add("4,3"));
        assertEquals(9, stringCalculator.Add("2,7"));
    }

    @Test
    void sumSeveralNumbers() {
        assertEquals(18, stringCalculator.Add("1,3,5,2,7"));
    }

    @Test
    void supportNewLineSeparator() {
        assertEquals(6, stringCalculator.Add("1\n2,3"));
    }

    @Test
    void supportCustomSeparator() {
        assertEquals(3, stringCalculator.Add("//;\n1;2"));
        assertEquals(21, stringCalculator.Add("//;\n1;2,4;5\n9"));
        assertEquals(21, stringCalculator.Add("//p\n1p2p4p5p9"));
    }

    @Test
    void disallowNegatives() {
        Exception exception = assertThrows(InvalidParameterException.class, () -> stringCalculator.Add("-1"));
        assertEquals("negatives not allowed: -1", exception.getMessage());
        exception = assertThrows(InvalidParameterException.class, () -> stringCalculator.Add("-1,-2"));
        assertEquals("negatives not allowed: -1,-2", exception.getMessage());
    }

    @Test
    void ignoreGreaterThan1000() {
        assertEquals(2, stringCalculator.Add("1001, 2"));
    }

    @Test
    void supportArbitraryLengthSeparators() {
        assertEquals(6, stringCalculator.Add("//[***]\n1***2***3"));
    }

    @Test
    void supportMultipleSeparators() {
        assertEquals(6, stringCalculator.Add("//[*][%]\n1*2%3"));
    }

    @Test
    void supportMultipleLongSeparators() {
        assertEquals(6, stringCalculator.Add("//[**][%%%]\n1**2%%%3"));
    }
}
