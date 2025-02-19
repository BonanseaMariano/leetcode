package easy.p0136;

/**
 * Solución para el problema de LeetCode "Single Number"
 * https://leetcode.com/problems/single-number
 * 
 * Este problema requiere encontrar el único número en un array que aparece una
 * sola vez,
 * mientras que todos los demás números aparecen exactamente dos veces.
 * 
 * Dificultad: Fácil
 * ID del Problema: 136
 * 
 * @author Mariano Bonansea
 */
public class SingleNumber {
    /**
     * Encuentra el número que aparece una sola vez en el array.
     * 
     * @param nums Array de enteros donde todos los elementos aparecen dos veces
     *             excepto uno que aparece una sola vez
     * @return El número que aparece una sola vez
     * 
     *         Funcionamiento:
     *         - Utiliza la propiedad XOR donde:
     *         - a XOR a = 0 (un número XOR consigo mismo es 0)
     *         - a XOR 0 = a (un número XOR 0 es el mismo número)
     *         - XOR es conmutativo y asociativo
     * 
     *         Ejemplo:
     *         Input: nums = [4,1,2,1,2]
     *         Output: 4
     *         Explicación:
     *         - 4 XOR 1 XOR 2 XOR 1 XOR 2
     *         - Los números que aparecen dos veces se cancelan (dan 0)
     *         - Solo queda el número que aparece una vez
     */
    public int singleNumber(int[] nums) {
        // Variable para almacenar el resultado acumulado de las operaciones XOR
        int result = 0;

        // Itera sobre cada número en el array
        for (int num : nums) {
            // Aplica XOR entre el resultado actual y el número
            // Los números que aparecen dos veces se cancelarán
            // Solo quedará el número que aparece una vez
            result ^= num;
        }

        // Retorna el número que aparece una sola vez
        return result;
    }
}
