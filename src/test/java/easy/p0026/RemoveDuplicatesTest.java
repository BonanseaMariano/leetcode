package easy.p0026;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates_case1() {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums1 = { 1, 1, 2 };
        int length1 = solution.removeDuplicates(nums1);
        assertEquals(2, length1);
        assertEquals(1, nums1[0]);
        assertEquals(2, nums1[1]);
    }

    @Test
    void testRemoveDuplicates_case2() {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int length2 = solution.removeDuplicates(nums2);
        assertEquals(5, length2);
        assertEquals(0, nums2[0]);
        assertEquals(1, nums2[1]);
        assertEquals(2, nums2[2]);
        assertEquals(3, nums2[3]);
        assertEquals(4, nums2[4]);
    }

    @Test
    void testRemoveDuplicates_case3() {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums3 = { 1, 1, 1, 1, 1 };
        int length3 = solution.removeDuplicates(nums3);
        assertEquals(1, length3);
        assertEquals(1, nums3[0]);
    }

    @Test
    void testRemoveDuplicates_case4() {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums4 = { 1, 2, 3, 4, 5 };
        int length4 = solution.removeDuplicates(nums4);
        assertEquals(5, length4);
        assertEquals(1, nums4[0]);
        assertEquals(2, nums4[1]);
        assertEquals(3, nums4[2]);
        assertEquals(4, nums4[3]);
        assertEquals(5, nums4[4]);
    }

    @Test
    void testRemoveDuplicates_case5() {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums6 = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int length6 = solution.removeDuplicates(nums6);
        assertEquals(5, length6);
        assertEquals(1, nums6[0]);
        assertEquals(2, nums6[1]);
        assertEquals(3, nums6[2]);
        assertEquals(4, nums6[3]);
        assertEquals(5, nums6[4]);
    }

    @Test
    void testRemoveDuplicates_case6() {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums7 = { 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        int length7 = solution.removeDuplicates(nums7);
        assertEquals(6, length7);
        assertEquals(1, nums7[0]);
        assertEquals(2, nums7[1]);
        assertEquals(3, nums7[2]);
        assertEquals(4, nums7[3]);
        assertEquals(5, nums7[4]);
        assertEquals(6, nums7[5]);
    }
}