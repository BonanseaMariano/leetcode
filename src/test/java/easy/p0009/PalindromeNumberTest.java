package easy.p0009;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeNumberTest {

    @ParameterizedTest
    @ValueSource(ints = { 121, 7, 12321, 0, 11, 1221 })
    void testPositivePalindromes(int number) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { -121, 10, 12345, 12, 123, 1234 })
    void testNegativePalindromes(int number) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertFalse(palindromeNumber.isPalindrome(number));
    }

}