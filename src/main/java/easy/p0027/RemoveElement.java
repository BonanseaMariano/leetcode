package easy.p0027;

/**
 * Solución para el problema de LeetCode "Remove Element" (Eliminar Elemento)
 * https://leetcode.com/problems/remove-element
 * 
 * Este problema requiere eliminar todas las ocurrencias de un valor específico
 * en un array
 * y retornar la nueva longitud del array modificado.
 * 
 * Dificultad: Fácil
 * ID del Problema: 27
 * 
 * @author Mariano Bonansea
 */
public class RemoveElement {

    /**
     * Elimina todas las ocurrencias de un valor específico en el array dado.
     * 
     * @param nums Array de enteros donde se realizará la eliminación
     * @param val  Valor que se debe eliminar del array
     * @return La nueva longitud del array después de eliminar todas las ocurrencias
     *         del valor
     * 
     *         Ejemplo:
     *         Input: nums = [3,2,2,3], val = 3
     *         Output: 2, nums = [2,2,_,_]
     * 
     *         Funcionamiento:
     *         - Utiliza dos punteros: uno para recorrer el array (i) y otro para
     *         mantener la posición
     *         donde se colocarán los elementos válidos (cont)
     *         - Solo se copian los elementos que son diferentes al valor a eliminar
     */
    public int removeElement(int[] nums, int val) {
        // Contador que servirá como índice para colocar los elementos válidos
        int cont = 0;

        // Recorre el array completo
        for (int i = 0; i < nums.length; i++) {
            // Si el elemento actual es diferente al valor a eliminar
            if (nums[i] != val) {
                // Coloca el elemento en la posición del contador
                nums[cont] = nums[i];
                // Incrementa el contador para la siguiente posición válida
                cont++;
            }
            // Si el elemento es igual a val, simplemente se ignora
        }

        // Retorna la nueva longitud del array (cantidad de elementos diferentes a val)
        return cont;
    }
}
