package easy.p0013;

/**
 * Solución para el problema de LeetCode "Roman to Integer" (Número Romano a
 * Entero)
 * https://leetcode.com/problems/roman-to-integer
 * 
 * Este problema requiere convertir un número romano representado como String
 * a su valor entero equivalente.
 * 
 * Dificultad: Fácil
 * ID del Problema: 13
 * 
 * @author Mariano Bonansea
 */
public class RomanToInteger {

    /**
     * Convierte un número romano a su valor entero equivalente.
     * 
     * @param s String que representa el número romano a convertir
     * @return El valor entero equivalente al número romano
     * 
     *         Ejemplo:
     *         Input: s = "MCMXCIV"
     *         Output: 1994
     * 
     *         Funcionamiento:
     *         - Recorre el string de derecha a izquierda
     *         - Convierte cada símbolo romano a su valor numérico
     *         - Si el valor actual es menor que el valor previo, se resta
     *         - Si el valor actual es mayor o igual que el previo, se suma
     *         - Esta lógica maneja casos especiales como IV (4) o IX (9)
     */
    public int romanToInt(String s) {
        // Variable para almacenar el resultado final
        int resultado = 0;
        // Variable para almacenar el valor numérico del símbolo romano actual
        int valorActual = 0;
        // Variable para almacenar el valor del símbolo anterior para comparación
        int valorPrevio = 0;

        // Iteramos el string de derecha a izquierda para manejar correctamente las
        // restas
        for (int i = s.length() - 1; i >= 0; i--) {
            // Convertimos cada símbolo romano a su valor decimal correspondiente
            switch (s.charAt(i)) {
                case 'M' -> valorActual = 1000; // M = 1000
                case 'D' -> valorActual = 500; // D = 500
                case 'C' -> valorActual = 100; // C = 100
                case 'L' -> valorActual = 50; // L = 50
                case 'X' -> valorActual = 10; // X = 10
                case 'V' -> valorActual = 5; // V = 5
                case 'I' -> valorActual = 1; // I = 1
            }

            // Lógica para manejar casos especiales como IV (4) o IX (9)
            if (valorActual < valorPrevio) {
                resultado -= valorActual;
            } else {
                resultado += valorActual;
            }

            // Guardamos el valor actual como previo para la siguiente iteración
            valorPrevio = valorActual;
        }
        return resultado;
    }
}
