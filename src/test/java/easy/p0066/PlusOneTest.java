package easy.p0066;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PlusOneTest {

    private PlusOne solution = new PlusOne();

    // Caso 1: 123 -> 124
    @Test
    void test123() {
        int[] input = { 1, 2, 3 };
        int[] expected = { 1, 2, 4 };
        assertArrayEquals(expected, solution.plusOne(input));
    }

    // Caso 2: 4321 -> 4322
    @Test
    void test4321() {
        int[] input = { 4, 3, 2, 1 };
        int[] expected = { 4, 3, 2, 2 };
        assertArrayEquals(expected, solution.plusOne(input));
    }

    // Caso 3: 9 -> 10
    @Test
    void test9() {
        int[] input = { 9 };
        int[] expected = { 1, 0 };
        assertArrayEquals(expected, solution.plusOne(input));
    }
}
