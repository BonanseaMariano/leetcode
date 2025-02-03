package easy.p0070;

/**
 * Solución para el problema de LeetCode "Climbing Stairs"
 * https://leetcode.com/problems/climbing-stairs
 * 
 * Este problema requiere calcular de cuántas formas distintas se puede subir
 * una escalera de n escalones, pudiendo subir 1 o 2 escalones cada vez.
 * 
 * Dificultad: Fácil
 * ID del Problema: 70
 * 
 * @author Mariano Bonansea
 */
public class ClimbingStairs {

    /**
     * Calcula el número de formas distintas de subir una escalera de n escalones.
     * 
     * @param n El número de escalones en la escalera
     * @return El número total de formas distintas de subir la escalera
     * 
     *         Ejemplo:
     *         Input: n = 3
     *         Output: 3
     *         Explicación: Hay tres formas de subir:
     *         1. 1 paso + 1 paso + 1 paso
     *         2. 1 paso + 2 pasos
     *         3. 2 pasos + 1 paso
     * 
     *         Funcionamiento:
     *         - Utiliza el principio de la secuencia de Fibonacci
     *         - Cada número es la suma de los dos anteriores
     *         - Optimizado para usar solo variables, sin array
     * 
     *         Complejidad Temporal: O(n) - una iteración por cada escalón después
     *         de 3
     *         Complejidad Espacial: O(1) - solo usa tres variables
     */
    public int climbStairs(int n) {
        // Casos base: para n <= 3, el resultado es n
        if (n <= 3)
            return n;

        // prev1 representa f(n-1), inicializado con f(3)
        int prev1 = 3;
        // prev2 representa f(n-2), inicializado con f(2)
        int prev2 = 2;
        // cur almacenará el resultado actual f(n)
        int cur = 0;

        // Calcula cada número siguiente como la suma de los dos anteriores
        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2; // El nuevo número es la suma de los dos anteriores
            prev2 = prev1; // Actualiza n-2 para la siguiente iteración
            prev1 = cur; // Actualiza n-1 para la siguiente iteración
        }

        return cur; // Retorna el número total de formas de subir la escalera
    }
}
