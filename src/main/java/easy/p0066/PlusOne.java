package easy.p0066;

/**
 * Solución para el problema de LeetCode "Plus One"
 * https://leetcode.com/problems/plus-one
 * 
 * Este problema requiere incrementar en 1 un número grande representado como
 * un array de dígitos.
 * Cada elemento del array contiene un solo dígito y el primer elemento
 * representa
 * el dígito más significativo.
 * 
 * Dificultad: Fácil
 * ID del Problema: 66
 * 
 * @author Mariano Bonansea
 */
public class PlusOne {

    /**
     * Incrementa en 1 un número representado como array de dígitos.
     * 
     * @param digits Array que representa el número a incrementar
     * @return Array con el resultado de la suma
     * 
     *         Ejemplo:
     *         Input: digits = [1,2,3]
     *         Output: [1,2,4]
     * 
     *         Input: digits = [9,9,9]
     *         Output: [1,0,0,0]
     * 
     *         Funcionamiento:
     *         - Itera el array desde el último dígito
     *         - Si el dígito + 1 no es 10, simplemente suma y retorna
     *         - Si es 10, coloca 0
     */
    public int[] plusOne(int[] digits) {
        // Iteramos el array desde el último dígito hacia el primero
        for (int i = digits.length - 1; i >= 0; i--) {
            // Verificamos si el dígito actual es menor a 9 (no hay carry)
            if (digits[i] < 9) {
                // Si no hay carry, simplemente incrementamos el dígito actual
                digits[i]++;
                // Retornamos el array original modificado ya que no necesitamos más cambios
                return digits;
            }
            // Si el dígito actual es 9, ponemos un 0 y continuamos con el siguiente
            // dígito
            digits[i] = 0;
        }

        // Si llegamos aquí, significa que todos los dígitos eran 9
        // Redimensionamos el array para agregar un dígito más (no importa el contenido
        // anterior ya que todos eran 9)
        digits = new int[digits.length + 1];
        // Colocamos 1 en la primera posición (los demás quedan en 0 por defecto)
        digits[0] = 1;
        // Retornamos el nuevo array (ejemplo: 999 + 1 = 1000)
        return digits;
    }

}
