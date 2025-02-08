package easy.p0083;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import easy.p0083.RemoveDuplicatesFromSortedList.ListNode;

class RemoveDuplicatesFromSortedListTest {
    private RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    // Método auxiliar para crear una lista enlazada a partir de un array de valores
    ListNode createList(int... values) {
        if (values.length == 0)
            return null;

        ListNode dummy = solution.new ListNode(0);
        ListNode current = dummy;

        for (int val : values) {
            current.next = solution.new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    // Método auxiliar para convertir una lista enlazada a String para facilitar las
    // comparaciones
    String listToString(ListNode head) {
        if (head == null)
            return "[]";

        StringBuilder sb = new StringBuilder("[");
        ListNode current = head;

        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }

    @Test
    // Prueba el caso básico de una lista con un duplicado: [1,1,2] -> [1,2]
    void testExample1() {
        ListNode input = createList(1, 1, 2);
        ListNode result = solution.deleteDuplicates(input);
        assertEquals("[1,2]", listToString(result));
    }

    @Test
    // Prueba una lista con múltiples duplicados: [1,1,2,3,3] -> [1,2,3]
    void testExample2() {
        ListNode input = createList(1, 1, 2, 3, 3);
        ListNode result = solution.deleteDuplicates(input);
        assertEquals("[1,2,3]", listToString(result));
    }

    @Test
    // Verifica el comportamiento con una lista vacía: [] -> []
    void testEmptyList() {
        ListNode result = solution.deleteDuplicates(null);
        assertNull(result);
    }

    @Test
    // Prueba una lista con un único nodo: [1] -> [1]
    void testSingleNode() {
        ListNode input = createList(1);
        ListNode result = solution.deleteDuplicates(input);
        assertEquals("[1]", listToString(result));
    }

    @Test
    // Verifica el caso donde todos los elementos son iguales: [1,1,1,1,1] -> [1]
    void testAllDuplicates() {
        ListNode input = createList(1, 1, 1, 1, 1);
        ListNode result = solution.deleteDuplicates(input);
        assertEquals("[1]", listToString(result));
    }

    @Test
    // Prueba una lista sin duplicados: [1,2,3,4,5] -> [1,2,3,4,5]
    void testNoDuplicates() {
        ListNode input = createList(1, 2, 3, 4, 5);
        ListNode result = solution.deleteDuplicates(input);
        assertEquals("[1,2,3,4,5]", listToString(result));
    }

    @Test
    // Verifica el comportamiento con los valores límite permitidos:
    // [-100,-100,0,0,100,100] -> [-100,0,100]
    void testBoundaryValues() {
        ListNode input = createList(-100, -100, 0, 0, 100, 100);
        ListNode result = solution.deleteDuplicates(input);
        assertEquals("[-100,0,100]", listToString(result));
    }
}
