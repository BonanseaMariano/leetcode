package easy.p0083;

/**
 * Solución para el problema de LeetCode "Remove Duplicates from Sorted List"
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list
 * 
 * Este problema requiere eliminar los nodos duplicados de una lista enlazada
 * ordenada,
 * manteniendo solo una ocurrencia de cada valor.
 * 
 * Dificultad: Fácil
 * ID del Problema: 83
 * 
 * @author Mariano Bonansea
 */
public class RemoveDuplicatesFromSortedList {
    /**
     * Clase interna que representa un nodo de la lista enlazada.
     */
    public class ListNode {
        int val; // Valor almacenado en el nodo
        ListNode next; // Referencia al siguiente nodo

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Elimina los nodos duplicados de una lista enlazada ordenada.
     * 
     * @param head Nodo cabeza de la lista enlazada ordenada
     * @return La lista modificada sin elementos duplicados
     * 
     *         Ejemplo:
     *         Input: head = [1,1,2,3,3]
     *         Output: [1,2,3]
     * 
     *         Funcionamiento:
     *         - Mantiene una referencia al nodo cabeza original para retornarla al
     *         final
     *         - Recorre la lista mientras exista un nodo actual y un siguiente
     *         - Compara valores adyacentes y ajusta los enlaces para saltar
     *         duplicados
     *         - Avanza al siguiente nodo solo cuando no hay duplicados
     */
    public ListNode deleteDuplicates(ListNode head) {
        // Guarda la referencia a la cabeza original para retornarla
        ListNode res = head;

        // Recorre la lista mientras el nodo actual y el siguiente existan
        while (head != null && head.next != null) {
            // Si encuentra valores duplicados consecutivos
            if (head.val == head.next.val) {
                // Salta el nodo duplicado ajustando la referencia next
                head.next = head.next.next;
            } else {
                // Si no hay duplicado, avanza al siguiente nodo
                head = head.next;
            }
        }

        // Retorna la lista modificada comenzando desde la cabeza original
        return res;
    }
}
