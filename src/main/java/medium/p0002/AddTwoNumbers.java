package medium.p0002;

/**
 * Solución para el problema de LeetCode "Add Two Numbers"
 * https://leetcode.com/problems/add-two-numbers
 * 
 * Este problema requiere sumar dos números representados como listas enlazadas
 * donde cada nodo contiene un solo dígito y los números están almacenados
 * en orden inverso.
 * 
 * Dificultad: Media
 * ID del Problema: 2
 * 
 * @author Mariano Bonansea
 */
public class AddTwoNumbers {
    /**
     * Definición de la estructura del nodo para la lista enlazada.
     * Cada nodo contiene un valor (dígito) y una referencia al siguiente nodo.
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

    /**
     * Suma dos números representados como listas enlazadas en orden inverso.
     * 
     * @param l1 Primera lista enlazada representando el primer número
     * @param l2 Segunda lista enlazada representando el segundo número
     * @return Nueva lista enlazada con la suma de los números
     * 
     *         Funcionamiento:
     *         - Procesa los dígitos de ambas listas simultáneamente
     *         - Mantiene un acarreo (carry) entre sumas
     *         - Construye una nueva lista con el resultado
     * 
     *         Ejemplo:
     *         Input: l1 = [2,4,3], l2 = [5,6,4]
     *         Output: [7,0,8]
     *         Explicación: 342 + 465 = 807
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Nodo dummy para simplificar la construcción de la lista resultado
        ListNode dummy = new ListNode();
        ListNode res = dummy; // Guarda la referencia al inicio de la lista resultado
        int total = 0;
        int carry = 0; // Variables para la suma y el acarreo

        // Continúa mientras haya dígitos por procesar en alguna lista o exista acarreo
        while (l1 != null || l2 != null || carry != 0) {
            // Inicializa la suma con el acarreo de la operación anterior
            total = carry;

            // Procesa el dígito de la primera lista si existe
            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            // Procesa el dígito de la segunda lista si existe
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            // Calcula el nuevo dígito y el acarreo
            int num = total % 10; // El dígito será el residuo de dividir por 10
            carry = total / 10; // El acarreo será el cociente de dividir por 10

            // Construye el nuevo nodo con el dígito calculado
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }

        // Retorna la lista resultado (excluyendo el nodo dummy inicial)
        return res.next;
    }
}
