package easy.p0069;

/**
 * Solución para el problema de LeetCode "Sqrt(x)"
 * https://leetcode.com/problems/sqrtx
 * 
 * Este problema requiere implementar la función sqrt(x) que calcule
 * la raíz cuadrada de un número entero x y devuelva la parte entera del
 * resultado.
 * 
 * Dificultad: Fácil
 * ID del Problema: 69
 * 
 * @author Mariano Bonansea
 */
public class Sqrt {

    /**
     * Calcula la raíz cuadrada entera de un número usando búsqueda binaria.
     * 
     * @param x El número entero no negativo del cual calcular la raíz cuadrada
     * @return La parte entera de la raíz cuadrada de x
     * 
     *         Ejemplo:
     *         Input: x = 4
     *         Output: 2
     *         Input: x = 8
     *         Output: 2 (ya que sqrt(8) = 2.82842...)
     * 
     *         Funcionamiento:
     *         - Utiliza búsqueda binaria para encontrar el mayor número cuyo
     *         cuadrado
     *         sea menor o igual a x
     *         - Evita desbordamiento usando división en lugar de multiplicación
     *         - Maneja el caso especial cuando x es 0
     * 
     *         Complejidad Temporal: O(log x) - búsqueda binaria
     *         Complejidad Espacial: O(1) - solo usa variables primitivas
     */
    public int mySqrt(int x) {
        // Caso especial: si x es 0, la raíz cuadrada es 0
        if (x == 0) {
            return 0;
        }

        // Inicialización de límites para búsqueda binaria
        int low = 1;
        int high = x;
        int result = 0;

        // Búsqueda binaria para encontrar la raíz cuadrada
        while (low <= high) {
            // Calculamos el punto medio evitando desbordamiento
            int mid = low + (high - low) / 2;

            // Comparamos mid^2 con x usando división para evitar desbordamiento
            // Si mid <= x/mid, entonces mid^2 <= x
            if (mid <= x / mid) {
                // Guardamos el candidato actual y seguimos buscando hacia arriba
                result = mid;
                low = mid + 1;
            } else {
                // El valor es muy grande, buscamos hacia abajo
                high = mid - 1;
            }
        }

        return result;
    }
}
