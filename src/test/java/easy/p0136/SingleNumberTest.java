package easy.p0136;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void testSingleNumber() {
        SingleNumber sn = new SingleNumber();

        assertEquals(1, sn.singleNumber(new int[] { 2, 2, 1 }));
        assertEquals(4, sn.singleNumber(new int[] { 4, 1, 2, 1, 2 }));
        assertEquals(1, sn.singleNumber(new int[] { 1 }));
    }
}
