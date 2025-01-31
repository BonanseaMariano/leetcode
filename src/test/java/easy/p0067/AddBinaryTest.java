package easy.p0067;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

    private AddBinary solution = new AddBinary();

    @Test
    void testExampleCases() {
        // Test case 1: "11" + "1" = "100"
        assertEquals("100", solution.addBinary("11", "1"));

        // Test case 2: "1010" + "1011" = "10101"
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }
}
