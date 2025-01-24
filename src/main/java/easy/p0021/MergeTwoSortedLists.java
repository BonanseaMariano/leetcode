package easy.p0021;

/**
 * Solución para el problema de LeetCode "Merge Two Sorted Lists"
 * https://leetcode.com/problems/merge-two-sorted-lists
 * 
 * Este problema requiere fusionar dos listas enlazadas ordenadas en una sola
 * lista
 * ordenada. Las listas de entrada están ordenadas en orden no decreciente.
 * 
 * Dificultad: Fácil
 * ID del Problema: 21
 * 
 * @author Mariano Bonansea
 */
public class MergeTwoSortedLists {

    /**
     * Fusiona dos listas enlazadas ordenadas en una sola lista ordenada.
     * 
     * @param list1 Primera lista enlazada ordenada
     * @param list2 Segunda lista enlazada ordenada
     * @return Lista enlazada fusionada y ordenada
     * 
     *         Ejemplo:
     *         Input: list1 = [1,2,4], list2 = [1,3,4]
     *         Output: [1,1,2,3,4,4]
     * 
     *         Input: list1 = [], list2 = []
     *         Output: []
     * 
     *         Funcionamiento:
     *         - Crea un nodo dummy como punto de partida
     *         - Compara los valores de ambas listas
     *         - Conecta el menor valor a la lista resultado
     *         - Avanza el puntero de la lista que contenía el menor valor
     *         - Al finalizar, conecta los elementos restantes de la lista no vacía
     * 
     *         Complejidad temporal: O(n + m) donde n y m son las longitudes de las
     *         listas
     *         Complejidad espacial: O(1) ya que solo se reutilizan los nodos
     *         existentes
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Creamos un nodo ficticio que servirá como cabeza de la lista resultante
        ListNode dummy = new ListNode(0);
        // Puntero auxiliar para ir construyendo la lista resultado
        ListNode op = dummy;

        // Mientras ambas listas tengan elementos por procesar
        while (list1 != null && list2 != null) {
            // Si el valor de list1 es menor o igual que el de list2
            if (list1.val <= list2.val) {
                // Conectamos el nodo de list1 a nuestra lista resultado
                op.next = list1;
                // Avanzamos al siguiente nodo en list1
                list1 = list1.next;
            } else {
                // Conectamos el nodo de list2 a nuestra lista resultado
                op.next = list2;
                // Avanzamos al siguiente nodo en list2
                list2 = list2.next;
            }
            // Avanzamos el puntero de la lista resultado
            op = op.next;
        }

        // Si alguna lista aún tiene elementos, los conectamos al final
        // usando el operador ternario para elegir la lista no vacía
        op.next = (list1 != null) ? list1 : list2;

        // Retornamos la lista resultado (excluyendo el nodo dummy)
        return dummy.next;
    }

    /**
     * Definición de un nodo de una lista enlazada
     */
    public class ListNode {
        int val;
        ListNode next;

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
}
