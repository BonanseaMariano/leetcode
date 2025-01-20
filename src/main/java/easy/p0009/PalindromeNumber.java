package easy.p0009;

/**
 * Solución para el problema de LeetCode "Palindrome Number"
 * https://leetcode.com/problems/palindrome-number
 * 
 * Este problema requiere determinar si un número entero es un palíndromo.
 * Un número es palíndromo si se lee igual de izquierda a derecha que de derecha
 * a izquierda.
 * 
 * Dificultad: Fácil
 * ID del Problema: 9
 * 
 * @author Mariano Bonansea
 */
public class PalindromeNumber {

    /**
     * Determina si un número es palíndromo.
     * 
     * @param x El número entero a verificar
     * @return true si el número es palíndromo, false en caso contrario
     * 
     *         Ejemplo:
     *         Input: x = 121
     *         Output: true
     *         Input: x = -121
     *         Output: false
     *         Input: x = 10
     *         Output: false
     * 
     *         Funcionamiento:
     *         - Maneja casos especiales: números negativos y números que terminan
     *         en 0
     *         - Invierte la mitad derecha del número y la compara con la mitad
     *         izquierda
     *         - No convierte el número a String para optimizar el espacio
     * 
     *         Complejidad Temporal: O(log10(x)) - procesamos cada dígito del número
     *         Complejidad Espacial: O(1) - solo usamos variables primitivas
     */
    public boolean isPalindrome(int x) {
        // Casos especiales:
        // 1. Números negativos nunca son palíndromos
        // 2. Números que terminan en 0 solo son palíndromos si son 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int inv = 0;
        // Invertimos la mitad derecha del número
        while (x > inv) {
            inv = inv * 10 + x % 10;
            x /= 10;
        }

        // Para números con cantidad par de dígitos: x == inv
        // Para números con cantidad impar de dígitos: x == inv/10
        return x == inv || x == inv / 10;
    }
}
