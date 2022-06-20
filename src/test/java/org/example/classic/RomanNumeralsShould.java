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
        decimalShouldBeRoman(1, "I");
        decimalShouldBeRoman(2, "II");
        decimalShouldBeRoman(3, "III");
        decimalShouldBeRoman(4, "IV");
        decimalShouldBeRoman(5, "V");
        decimalShouldBeRoman(6, "VI");
        decimalShouldBeRoman(7, "VII");
        decimalShouldBeRoman(8, "VIII");
        decimalShouldBeRoman(9, "IX");
        decimalShouldBeRoman(10, "X");
        decimalShouldBeRoman(11, "XI");
        decimalShouldBeRoman(12, "XII");
        decimalShouldBeRoman(13, "XIII");
        decimalShouldBeRoman(14, "XIV");
        decimalShouldBeRoman(15, "XV");
        decimalShouldBeRoman(16, "XVI");
        decimalShouldBeRoman(17, "XVII");
        decimalShouldBeRoman(18, "XVIII");
        decimalShouldBeRoman(19, "XIX");
        decimalShouldBeRoman(20, "XX");
        decimalShouldBeRoman(29, "XXIX");
        decimalShouldBeRoman(30, "XXX");
        decimalShouldBeRoman(40, "XL");
        decimalShouldBeRoman(50, "L");
        decimalShouldBeRoman(90, "XC");
        decimalShouldBeRoman(100, "C");
        decimalShouldBeRoman(200, "CC");
        decimalShouldBeRoman(400, "CD");
        decimalShouldBeRoman(500, "D");
        decimalShouldBeRoman(900, "CM");
        decimalShouldBeRoman(1000, "M");
        decimalShouldBeRoman(2019, "MMXIX");
        decimalShouldBeRoman(294, "CCXCIV");

    }

    private void decimalShouldBeRoman(int decimal, String roman) {
        assertEquals(roman, this.roman.convert(decimal));
    }
}
