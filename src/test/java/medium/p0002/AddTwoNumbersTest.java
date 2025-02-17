package medium.p0002;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    private AddTwoNumbers solution = new AddTwoNumbers();

    private AddTwoNumbers.ListNode createList(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return null;

        AddTwoNumbers.ListNode dummy = solution.new ListNode(0);
        AddTwoNumbers.ListNode current = dummy;

        for (int num : numbers) {
            current.next = solution.new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    private int[] toArray(AddTwoNumbers.ListNode head) {
        int size = 0;
        AddTwoNumbers.ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] result = new int[size];
        current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.val;
            current = current.next;
        }
        return result;
    }

    private void assertListEquals(int[] expected, AddTwoNumbers.ListNode actual) {
        int[] actualArray = toArray(actual);
        assertArrayEquals(expected, actualArray);
    }

    private void assertArrayEquals(int[] expected, int[] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testCase1() {
        AddTwoNumbers.ListNode l1 = createList(new int[] { 2, 4, 3 });
        AddTwoNumbers.ListNode l2 = createList(new int[] { 5, 6, 4 });
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        assertListEquals(new int[] { 7, 0, 8 }, result);
    }

    @Test
    void testCase2() {
        AddTwoNumbers.ListNode l1 = createList(new int[] { 0 });
        AddTwoNumbers.ListNode l2 = createList(new int[] { 0 });
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        assertListEquals(new int[] { 0 }, result);
    }

    @Test
    void testCase3() {
        AddTwoNumbers.ListNode l1 = createList(new int[] { 9, 9, 9, 9, 9, 9, 9 });
        AddTwoNumbers.ListNode l2 = createList(new int[] { 9, 9, 9, 9 });
        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        assertListEquals(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 }, result);
    }
}
