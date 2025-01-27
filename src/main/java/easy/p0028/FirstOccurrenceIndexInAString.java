package easy.p0028;

/**
 * Solución para el problema de LeetCode "Find the Index of the First Occurrence
 * in a String"
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 * 
 * Este problema requiere encontrar la primera ocurrencia de una subcadena
 * (needle)
 * dentro de otra cadena (haystack).
 * 
 * Dificultad: Fácil
 * ID del Problema: 28
 * 
 * @author Mariano Bonansea
 */
public class FirstOccurrenceIndexInAString {

    /**
     * Encuentra el índice de la primera ocurrencia de needle en haystack.
     * 
     * @param haystack La cadena en la que buscar
     * @param needle   La subcadena a buscar
     * @return El índice de la primera ocurrencia de needle en haystack, o -1 si no
     *         se encuentra
     * 
     *         Ejemplo:
     *         Input: haystack = "sadbutsad", needle = "sad"
     *         Output: 0
     * 
     *         Input: haystack = "leetcode", needle = "leeto"
     *         Output: -1
     * 
     *         Funcionamiento:
     *         - Utiliza una ventana deslizante del tamaño de needle
     *         - Compara cada subcadena con needle
     *         - Retorna el índice cuando encuentra coincidencia
     * 
     *         Complejidad temporal: O(n*m) donde n es la longitud de haystack y m
     *         la longitud de needle
     *         Complejidad espacial: O(1) ya que solo usamos variables para los
     *         índices
     */
    public int strStr(String haystack, String needle) {
        // Iteramos usando una ventana deslizante:
        // i es el índice inicial de la ventana
        // j es el índice final de la ventana (tamaño de needle)
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            // Extraemos la subcadena actual y la comparamos con needle
            if (haystack.substring(i, j).equals(needle)) {
                return i; // Si hay coincidencia, retornamos el índice inicial
            }
        }
        // Si no se encontró coincidencia, retornamos -1
        return -1;
    }
}
