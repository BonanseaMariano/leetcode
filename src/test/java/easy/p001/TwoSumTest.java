package easy.p001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    private TwoSum solution = new TwoSum();

    @Test
    void test1() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void test2() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void test3() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
