package easy.p0069;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SqrtTest {

    private final Sqrt solution = new Sqrt();

    @Test
    void testSqrtCases() {
        // Caso 1: x = 4
        assertEquals(2, solution.mySqrt(4));

        // Caso 2: x = 8
        assertEquals(2, solution.mySqrt(8));
    }
}
