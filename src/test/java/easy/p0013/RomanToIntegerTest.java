package easy.p0013;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void testRomanToInt() {
        RomanToInteger converter = new RomanToInteger();

        assertEquals(1, converter.romanToInt("I"));
        assertEquals(3, converter.romanToInt("III"));
        assertEquals(4, converter.romanToInt("IV"));
        assertEquals(9, converter.romanToInt("IX"));
        assertEquals(58, converter.romanToInt("LVIII"));
        assertEquals(1994, converter.romanToInt("MCMXCIV"));
        assertEquals(3999, converter.romanToInt("MMMCMXCIX"));
        assertEquals(0, converter.romanToInt(""));
    }
}