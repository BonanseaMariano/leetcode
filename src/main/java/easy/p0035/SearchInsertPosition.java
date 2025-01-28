package easy.p0035;

/**
 * Solución para el problema de LeetCode "Search Insert Position"
 * https://leetcode.com/problems/search-insert-position
 * 
 * Este problema requiere encontrar el índice donde se debe insertar un valor
 * objetivo
 * en un array ordenado de manera que se mantenga el orden.
 * 
 * Dificultad: Fácil
 * ID del Problema: 35
 * 
 * @author Mariano Bonansea
 */
public class SearchInsertPosition {

    /**
     * Encuentra la posición donde debería insertarse un valor objetivo en un array
     * ordenado.
     * 
     * @param nums   Array ordenado de enteros
     * @param target Valor objetivo a insertar
     * @return El índice donde el valor objetivo debería ser insertado
     * 
     *         Ejemplo:
     *         Input: nums = [1,3,5,6], target = 5
     *         Output: 2
     * 
     *         Input: nums = [1,3,5,6], target = 2
     *         Output: 1
     * 
     *         Funcionamiento:
     *         - Utiliza búsqueda binaria para encontrar la posición
     *         - Si encuentra el valor, retorna su posición
     *         - Si no lo encuentra, retorna la posición donde debería insertarse
     * 
     *         Complejidad temporal: O(log n) donde n es la longitud del array
     *         Complejidad espacial: O(1) ya que solo usa variables para los índices
     */
    public int searchInsert(int[] nums, int target) {
        // Inicializamos los punteros de inicio y fin
        int start = 0;
        int end = nums.length - 1;

        // Realizamos búsqueda binaria mientras los punteros no se crucen
        while (start <= end) {
            // Calculamos el punto medio evitando desbordamiento
            int mid = start + (end - start) / 2;

            // Si encontramos el target, retornamos su posición
            if (nums[mid] == target)
                return mid;
            // Si el valor medio es mayor que el target, buscamos en la mitad izquierda
            else if (nums[mid] > target)
                end = mid - 1;
            // Si el valor medio es menor que el target, buscamos en la mitad derecha
            else
                start = mid + 1;
        }

        // Si no encontramos el target, 'start' contendrá la posición correcta de
        // inserción
        return start;
    }
}
