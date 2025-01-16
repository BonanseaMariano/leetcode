package easy.p0027;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void testRemoveElement() {
        RemoveElement removeElement = new RemoveElement();

        int[] nums1 = { 3, 2, 2, 3 };
        int val1 = 3;
        int newLength1 = removeElement.removeElement(nums1, val1);
        assertEquals(2, newLength1);
        assertEquals(2, nums1[0]);
        assertEquals(2, nums1[1]);

        int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val2 = 2;
        int newLength2 = removeElement.removeElement(nums2, val2);
        assertEquals(5, newLength2);
        assertEquals(0, nums2[0]);
        assertEquals(1, nums2[1]);
        assertEquals(3, nums2[2]);
        assertEquals(0, nums2[3]);
        assertEquals(4, nums2[4]);

        int[] nums3 = { 1 };
        int val3 = 1;
        int newLength3 = removeElement.removeElement(nums3, val3);
        assertEquals(0, newLength3);

        int[] nums4 = { 4, 5 };
        int val4 = 4;
        int newLength4 = removeElement.removeElement(nums4, val4);
        assertEquals(1, newLength4);
        assertEquals(5, nums4[0]);
    }
}