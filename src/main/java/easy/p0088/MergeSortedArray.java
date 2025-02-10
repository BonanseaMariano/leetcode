package easy.p0088;

/**
 * Solución para el problema de LeetCode "Merge Sorted Array"
 * https://leetcode.com/problems/merge-sorted-array
 * 
 * Este problema requiere combinar dos arrays ordenados nums1 y nums2 en un solo
 * array
 * ordenado. El array nums1 tiene suficiente espacio (m + n) para contener los
 * elementos de ambos arrays.
 * 
 * Dificultad: Fácil
 * ID del Problema: 88
 * 
 * @author Mariano Bonansea
 */
public class MergeSortedArray {

    /**
     * Combina dos arrays ordenados en uno solo.
     * 
     * @param nums1 Array que contiene los primeros m elementos y tiene espacio
     *              total
     *              de m+n
     * @param m     Número de elementos en nums1
     * @param nums2 Array que contiene n elementos
     * @param n     Número de elementos en nums2
     * 
     *              Ejemplo:
     *              Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     *              Output: [1,2,2,3,5,6]
     * 
     *              Funcionamiento:
     *              - Utiliza un enfoque de fusión desde el final de los arrays
     *              - Compara elementos de ambos arrays y coloca el mayor en la
     *              posición
     *              final
     *              - Continúa hasta que todos los elementos de nums2 estén
     *              colocados
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // i: índice para recorrer nums1 (elementos originales)
        int i = m - 1;
        // j: índice para recorrer nums2
        int j = n - 1;
        // k: índice para colocar elementos en la posición final de nums1
        int k = m + n - 1;

        // Continúa mientras queden elementos en nums2 por procesar
        while (j >= 0) {
            // Compara elementos de ambos arrays y coloca el mayor en la posición k
            if (i >= 0 && nums1[i] > nums2[j]) {
                // Si el elemento de nums1 es mayor, lo coloca en la posición k
                nums1[k--] = nums1[i--];
            } else {
                // Si el elemento de nums2 es mayor o igual, o no quedan elementos en nums1,
                // coloca el elemento de nums2 en la posición k
                nums1[k--] = nums2[j--];
            }
        }
    }
}
