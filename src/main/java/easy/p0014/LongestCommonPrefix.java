package easy.p0014;

/**
 * Solución para el problema de LeetCode "Longest Common Prefix"
 * https://leetcode.com/problems/longest-common-prefix
 * 
 * Este problema requiere encontrar el prefijo común más largo entre un array de
 * strings.
 * Si no existe un prefijo común, devuelve una cadena vacía.
 * 
 * Dificultad: Fácil
 * ID del Problema: 14
 * 
 * @author Mariano Bonansea
 */
public class LongestCommonPrefix {

    /**
     * Encuentra el prefijo común más largo en un array de strings.
     * 
     * @param strs Array de strings donde buscar el prefijo común
     * @return El prefijo común más largo encontrado, o cadena vacía si no existe
     * 
     *         Ejemplo:
     *         Input: strs = ["flower","flow","flight"]
     *         Output: "fl"
     * 
     *         Input: strs = ["dog","racecar","car"]
     *         Output: ""
     * 
     *         Funcionamiento:
     *         - Toma el primer string como prefijo inicial
     *         - Itera sobre los demás strings
     *         - Para cada string, reduce el prefijo hasta encontrar una
     *         coincidencia
     *         - Si en algún momento el prefijo queda vacío, retorna ""
     * 
     *         Complejidad temporal: O(S) donde S es la suma de todos los caracteres
     *         en todos los strings
     *         Complejidad espacial: O(1) ya que solo almacenamos el prefijo
     */
    public String longestCommonPrefix(String[] strs) {
        // Tomamos el primer string del array como prefijo inicial
        String prefix = strs[0];

        // Iteramos sobre cada string del array comenzando desde el segundo
        for (int index = 1; index < strs.length; index++) {
            // Mientras el string actual no comience con el prefijo
            // reducimos el prefijo quitando el último carácter
            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // Si el prefijo se vuelve vacío, no hay prefijo común
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Retornamos el prefijo común encontrado
        return prefix;
    }
}
