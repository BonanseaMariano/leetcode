package easy.p0020;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidParenthesisTest {
    private final ValidParenthesis vp = new ValidParenthesis();

    @ParameterizedTest
    @ValueSource(strings = {
            "()",
            "()[]{}",
            "{[()]}",
            ""
    })
    void testValidParentheses(String input) {
        assertTrue(vp.isValid(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "(]",
            "([)]",
            "{[(])}",
            "((("
    })
    void testInvalidParentheses(String input) {
        assertFalse(vp.isValid(input));
    }
}