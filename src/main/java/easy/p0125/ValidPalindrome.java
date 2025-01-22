package easy.p0125;

/**
 * Solución para el problema de LeetCode "Valid Palindrome"
 * https://leetcode.com/problems/valid-palindrome
 * 
 * Este problema requiere determinar si una cadena es un palíndromo considerando
 * solo
 * caracteres alfanuméricos e ignorando mayúsculas/minúsculas.
 * 
 * Dificultad: Fácil
 * ID del Problema: 125
 * 
 * @author Mariano Bonansea
 */
public class ValidPalindrome {

    /**
     * Verifica si una cadena es un palíndromo válido.
     * 
     * @param s Cadena a verificar que puede contener letras, números y caracteres
     *          especiales
     * @return true si la cadena es un palíndromo, false en caso contrario
     * 
     *         Ejemplo:
     *         Input: s = "A man, a plan, a canal: Panama"
     *         Output: true
     * 
     *         Input: s = "race a car"
     *         Output: false
     * 
     *         Funcionamiento:
     *         - Utiliza dos punteros (inicio y fin) que se mueven hacia el centro
     *         - Ignora caracteres no alfanuméricos
     *         - Compara los caracteres convertidos a minúsculas
     *         - Se detiene cuando los punteros se cruzan
     */
    public boolean isPalindrome(String s) {
        // Caso base: cadena vacía es palíndromo
        if (s.isEmpty()) {
            return true;
        }

        // Inicializamos punteros al inicio y fin de la cadena
        int start = 0;
        int last = s.length() - 1;

        // Continuamos mientras los punteros no se crucen
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            // Si el carácter del inicio no es alfanumérico, lo saltamos
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            }
            // Si el carácter del final no es alfanumérico, lo saltamos
            else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            }
            // Comparamos los caracteres válidos
            else {
                // Si los caracteres no coinciden (ignorando mayúsculas),
                // no es un palíndromo
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                // Movemos ambos punteros hacia el centro
                start++;
                last--;
            }
        }

        // Si llegamos aquí, todos los caracteres coincidieron
        return true;
    }
}
