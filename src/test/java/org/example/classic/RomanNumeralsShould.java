package org.example.classic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {

    private Roman roman;

    @BeforeEach
    void setUp() {
        roman = new Roman();
    }

    @Test
    void convertArabicToRoman() {
        assertEquals("I", roman.convert(1));
        assertEquals("II", roman.convert(2));
        assertEquals("III", roman.convert(3));
        assertEquals("IV", roman.convert(4));
        assertEquals("V", roman.convert(5));
        assertEquals("VI", roman.convert(6));
        assertEquals("VII", roman.convert(7));
        assertEquals("VIII", roman.convert(8));
        assertEquals("IX", roman.convert(9));
        assertEquals("X", roman.convert(10));
        assertEquals("XI", roman.convert(11));
        assertEquals("XII", roman.convert(12));
        assertEquals("XIII", roman.convert(13));
        assertEquals("XIV", roman.convert(14));
        assertEquals("XV", roman.convert(15));
        assertEquals("XVI", roman.convert(16));
        assertEquals("XVII", roman.convert(17));
        assertEquals("XVIII", roman.convert(18));
        assertEquals("XIX", roman.convert(19));
        assertEquals("XX", roman.convert(20));
        assertEquals("XXIX", roman.convert(29));
        assertEquals("XXX", roman.convert(30));
        assertEquals("XL", roman.convert(40));
        assertEquals("L", roman.convert(50));
        assertEquals("XC", roman.convert(90));
        assertEquals("C", roman.convert(100));
        assertEquals("CC", roman.convert(200));
        assertEquals("CD", roman.convert(400));
        assertEquals("D", roman.convert(500));
        assertEquals("CM", roman.convert(900));
        assertEquals("M", roman.convert(1000));
        assertEquals("MMXIX", roman.convert(2019));
        assertEquals("CCXCIV", roman.convert(294));

    }
}
