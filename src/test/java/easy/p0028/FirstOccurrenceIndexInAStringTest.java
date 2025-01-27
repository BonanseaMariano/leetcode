package easy.p0028;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstOccurrenceIndexInAStringTest {

    private FirstOccurrenceIndexInAString solution = new FirstOccurrenceIndexInAString();

    @Test
    void testStrStr() {
        // Caso 1: "sadbutsad", "sad" -> 0
        assertEquals(0, solution.strStr("sadbutsad", "sad"));

        // Caso 2: "leetcode", "leeto" -> -1
        assertEquals(-1, solution.strStr("leetcode", "leeto"));

        // Caso 3: "hello", "ll" -> 2
        assertEquals(2, solution.strStr("hello", "ll"));

        // Caso 4: "mississippi", "issip" -> 4
        assertEquals(4, solution.strStr("mississippi", "issip"));
    }
}
