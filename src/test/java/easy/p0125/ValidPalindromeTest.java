package easy.p0125;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidPalindromeTest {

    private final ValidPalindrome solution = new ValidPalindrome();

    @ParameterizedTest
    @ValueSource(strings = {
            "A man, a plan, a canal: Panama",
            " ",
            ".,",
            "a."
    })
    void testValidPalindromes(String input) {
        assertTrue(solution.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "race a car",
            "hello world",
            "Java is fun",
            "0P"
    })
    void testInvalidPalindromes(String input) {
        assertFalse(solution.isPalindrome(input));
    }
}
