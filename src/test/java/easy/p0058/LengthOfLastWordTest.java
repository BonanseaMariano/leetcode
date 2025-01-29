package easy.p0058;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {

    private final LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    void testLengthOfLastWord() {
        // Caso 1: palabra simple al final
        assertEquals(5, solution.lengthOfLastWord("Hello World"));

        // Caso 2: múltiples espacios entre palabras y al final
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));

        // Caso 3: sin espacios al final
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));

        // Caso 4: una sola letra
        assertEquals(1, solution.lengthOfLastWord("a"));
    }
}
