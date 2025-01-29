package easy.p0058;

/**
 * Solución para el problema de LeetCode "Length of Last Word"
 * https://leetcode.com/problems/length-of-last-word
 * 
 * Este problema requiere encontrar la longitud de la última palabra en una
 * cadena.
 * Una palabra es una secuencia de caracteres que no contiene espacios.
 * 
 * Dificultad: Fácil
 * ID del Problema: 58
 * 
 * @author Mariano Bonansea
 */
public class LengthOfLastWord {

    /**
     * Calcula la longitud de la última palabra en una cadena.
     * 
     * @param s La cadena de entrada que contiene palabras separadas por espacios.
     *          Garantizado que contiene al menos una palabra.
     * @return La longitud de la última palabra en la cadena
     * 
     *         Ejemplo:
     *         Input: s = "Hello World"
     *         Output: 5
     * 
     *         Input: s = " fly me to the moon "
     *         Output: 4
     * 
     *         Funcionamiento:
     *         - Encuentra el último carácter no espacio desde el final
     *         - Cuenta los caracteres hasta encontrar un espacio o el inicio
     * 
     *         Complejidad temporal: O(n) donde n es la longitud de la cadena
     *         Complejidad espacial: O(1) ya que solo usamos dos variables para
     *         índices
     */
    public int lengthOfLastWord(String s) {
        // Comenzamos desde el final de la cadena
        int end = s.length() - 1;

        // Saltamos los espacios finales
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        // Encontramos el inicio de la última palabra
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        // Retornamos la longitud (end - start)
        // start está en el espacio anterior a la palabra (o -1)
        return end - start;
    }
}
