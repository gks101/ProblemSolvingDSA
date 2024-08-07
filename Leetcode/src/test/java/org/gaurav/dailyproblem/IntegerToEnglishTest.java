package org.gaurav.dailyproblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToEnglishTest {

    @Test
    void convertToWords_whenNumberIsSingleDigit_returnsSingleDigitWord() {
        IntegerToEnglish converter = new IntegerToEnglish();
        assertEquals("One", converter.convertToWords(1));
    }

    @Test
    void convertToWords_whenNumberIsTwoDigits_returnsTwoDigitWord() {
        IntegerToEnglish converter = new IntegerToEnglish();
        assertEquals("Twenty One", converter.convertToWords(21));
    }

    @Test
    void convertToWords_whenNumberIsThreeDigits_returnsThreeDigitWord() {
        IntegerToEnglish converter = new IntegerToEnglish();
        assertEquals("One Hundred One", converter.convertToWords(101));
    }

    @Test
    void convertToWords_whenNumberIsMultipleOfTen_returnsTensWord() {
        IntegerToEnglish converter = new IntegerToEnglish();
        assertEquals("Twenty", converter.convertToWords(20));
    }
}