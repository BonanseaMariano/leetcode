package easy.p0020;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Solución para el problema de LeetCode "Valid Parentheses"
 * https://leetcode.com/problems/valid-parentheses
 * 
 * Este problema requiere determinar si una cadena que contiene paréntesis,
 * corchetes y llaves está correctamente balanceada.
 * 
 * Dificultad: Fácil
 * ID del Problema: 20
 * 
 * @author Mariano Bonansea
 */
public class ValidParenthesis {

    /**
     * Verifica si una cadena de paréntesis está correctamente balanceada.
     * 
     * @param s Cadena que contiene solo los caracteres '(', ')', '{', '}', '[' y
     *          ']'
     * @return true si la cadena está balanceada, false en caso contrario
     * 
     *         Ejemplo:
     *         Input: s = "()[]{}"
     *         Output: true
     * 
     *         Input: s = "([)]"
     *         Output: false
     * 
     *         Funcionamiento:
     *         - Utiliza una pila (stack) para almacenar los paréntesis de apertura
     *         - Para cada paréntesis de cierre, verifica si corresponde con el
     *         último
     *         paréntesis de apertura en la pila
     *         - La cadena está balanceada si al final la pila queda vacía
     */
    public boolean isValid(String s) {
        // Creamos una pila (stack) para almacenar los paréntesis de apertura
        Deque<Character> stack = new ArrayDeque<>();

        // Recorremos cada carácter de la cadena
        for (char c : s.toCharArray()) {
            // Si es un paréntesis de apertura, lo añadimos a la pila
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // Si es un paréntesis de cierre y la pila está vacía,
                // significa que no hay paréntesis de apertura correspondiente
                if (stack.isEmpty())
                    return false;

                // Verificamos si el paréntesis de cierre actual corresponde
                // con el último paréntesis de apertura en la pila
                // Si no corresponden, la cadena no está balanceada
                if ((c == ')' && stack.peek() != '(') ||
                        (c == ']' && stack.peek() != '[') ||
                        (c == '}' && stack.peek() != '{'))
                    return false;

                // Si corresponden, eliminamos el paréntesis de apertura de la pila
                stack.pop();
            }
        }

        // La cadena está balanceada solo si la pila queda vacía
        // (todos los paréntesis de apertura fueron cerrados)
        return stack.isEmpty();
    }

}
