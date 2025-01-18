package easy.p0026;

/**
 * Solución para el problema de LeetCode "Remove Duplicates from Sorted Array"
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * 
 * Este problema requiere eliminar los elementos duplicados de un array ordenado
 * modificando el array in-place y retornando la nueva longitud del array.
 * 
 * Dificultad: Fácil
 * ID del Problema: 26
 * 
 * @author Mariano Bonansea
 */
public class RemoveDuplicates {

    /**
     * Elimina los elementos duplicados de un array ordenado.
     * 
     * @param nums Array ordenado de enteros donde se eliminarán los duplicados
     * @return La nueva longitud del array después de eliminar los duplicados
     * 
     *         Ejemplo:
     *         Input: nums = [1,1,2]
     *         Output: 2, nums = [1,2,_]
     * 
     *         Funcionamiento:
     *         - Utiliza dos punteros: uno para recorrer el array (i) y otro para
     *         mantener
     *         la posición donde se colocarán los elementos únicos (cont)
     *         - Como el array está ordenado, solo necesitamos comparar cada
     *         elemento
     *         con el anterior para detectar duplicados
     *         - El primer elemento siempre es válido, por lo que cont comienza en 1
     */
    public int removeDuplicates(int[] nums) {
        // Contador que servirá como índice para colocar los elementos únicos
        // Comienza en 1 porque el primer elemento siempre es válido
        int cont = 1;

        // Recorre el array desde el segundo elemento
        for (int i = 1; i < nums.length; i++) {
            // Si el elemento actual es diferente al anterior
            if (nums[i] != nums[i - 1]) {
                // Coloca el elemento en la posición del contador
                nums[cont] = nums[i];
                // Incrementa el contador para la siguiente posición única
                cont++;
            }
            // Si el elemento es igual al anterior, se ignora (es un duplicado)
        }

        // Retorna la nueva longitud del array (cantidad de elementos únicos)
        return cont;
    }
}
