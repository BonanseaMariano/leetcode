package easy.p0021;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import easy.p0021.MergeTwoSortedLists.ListNode;

class MergeTwoSortedListsTest {

    private MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testMergeTwoLists(int[] list1Values, int[] list2Values, int[] expectedValues) {
        ListNode list1 = createList(list1Values);
        ListNode list2 = createList(list2Values);

        ListNode result = solution.mergeTwoLists(list1, list2);

        if (expectedValues.length == 0) {
            assertNull(result);
        } else {
            assertListEquals(expectedValues, result);
        }
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        new int[] { 1, 2, 4 },
                        new int[] { 1, 3, 4 },
                        new int[] { 1, 1, 2, 3, 4, 4 }),
                Arguments.of(
                        new int[] {},
                        new int[] {},
                        new int[] {}),
                Arguments.of(
                        new int[] {},
                        new int[] { 0 },
                        new int[] { 0 }));
    }

    private ListNode createList(int[] values) {
        if (values.length == 0)
            return null;

        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode dummy = solution.new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = solution.new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    private void assertListEquals(int[] expected, ListNode actual) {
        int i = 0;
        while (actual != null && i < expected.length) {
            assertEquals(expected[i], actual.val);
            actual = actual.next;
            i++;
        }
        assertEquals(i, expected.length);
        assertNull(actual);
    }
}
