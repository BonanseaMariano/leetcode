package easy.p0035;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    private final SearchInsertPosition solution = new SearchInsertPosition();

    @Test
    void shouldFindExistingElement() {
        // Dado
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;

        // Cuando
        int result = solution.searchInsert(nums, target);

        // Entonces
        assertEquals(2, result, "Debería encontrar el 5 en la posición 2");
    }

    @Test
    void shouldFindInsertPositionInMiddle() {
        // Dado
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;

        // Cuando
        int result = solution.searchInsert(nums, target);

        // Entonces
        assertEquals(1, result, "Debería insertar el 2 en la posición 1");
    }

    @Test
    void shouldFindInsertPositionAtEnd() {
        // Dado
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;

        // Cuando
        int result = solution.searchInsert(nums, target);

        // Entonces
        assertEquals(4, result, "Debería insertar el 7 en la posición 4");
    }
}
