package easy.p0088;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

    private MergeSortedArray solution = new MergeSortedArray();

    @Test
    void testMergeNormalCase() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, nums1);
    }

    @Test
    void testMergeSingleElementAndEmpty() {
        int[] nums1 = { 1 };
        int[] nums2 = {};
        solution.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[] { 1 }, nums1);
    }

    @Test
    void testMergeEmptyAndSingle() {
        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        solution.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[] { 1 }, nums1);
    }

    @Test
    void testMergeWithLargerNumbers() {
        int[] nums1 = { 4, 5, 6, 0, 0, 0 };
        int[] nums2 = { 1, 2, 3 };
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, nums1);
    }
}
