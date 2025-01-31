package easy.p001;

import java.util.HashMap;
import java.util.Map;

/**
 * Solución para el problema de LeetCode "Two Sum"
 * https://leetcode.com/problems/two-sum
 * 
 * Este problema requiere encontrar dos números en un array que sumen un valor
 * objetivo
 * y retornar sus índices.
 * 
 * Dificultad: Fácil
 * ID del Problema: 1
 * 
 * @author Mariano Bonansea
 */
public class TwoSum {

    /**
     * Encuentra dos números en el array que sumen el valor objetivo.
     * 
     * @param nums   Array de números enteros
     * @param target Valor objetivo que debe ser la suma de dos números
     * @return Array con los índices de los dos números que suman target
     * 
     *         Ejemplo:
     *         Input: nums = [2,7,11,15], target = 9
     *         Output: [0,1] (porque nums[0] + nums[1] = 2 + 7 = 9)
     * 
     *         Funcionamiento:
     *         - Utiliza un HashMap para almacenar los números ya vistos
     *         - Para cada número, busca si su complemento existe en el mapa
     *         - Complejidad temporal: O(n)
     *         - Complejidad espacial: O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        // HashMap para almacenar los números visitados y sus índices
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Calculamos el complemento necesario para alcanzar el target
            int complement = target - nums[i];

            // Si el complemento existe en el mapa, hemos encontrado la solución
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            // Si no encontramos el complemento, agregamos el número actual al mapa
            numMap.put(nums[i], i);
        }

        // Si no se encuentra solución, retornamos un array vacío
        return new int[] {};
    }
}
