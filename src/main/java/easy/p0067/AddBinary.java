package easy.p0067;

/**
 * Solución para el problema de LeetCode "Add Binary"
 * https://leetcode.com/problems/add-binary
 * 
 * Este problema requiere sumar dos números binarios representados como strings
 * y retornar el resultado como string.
 * 
 * Dificultad: Fácil
 * ID del Problema: 67
 * 
 * @author Mariano Bonansea
 */
public class AddBinary {

    /**
     * Suma dos números binarios representados como strings.
     * 
     * @param a Primer número binario como string
     * @param b Segundo número binario como string
     * @return String que representa la suma binaria
     * 
     *         Ejemplo:
     *         Input: a = "11", b = "1"
     *         Output: "100"
     * 
     *         Input: a = "1010", b = "1011"
     *         Output: "10101"
     * 
     *         Funcionamiento:
     *         - Procesa los números de derecha a izquierda
     *         - Mantiene un carry para los acarreos
     *         - Construye el resultado en un StringBuilder
     */
    public String addBinary(String a, String b) {
        // Utilizamos StringBuilder para construir el resultado eficientemente
        StringBuilder sb = new StringBuilder();
        // Variable para mantener el acarreo entre sumas
        int carry = 0;
        // Índices para recorrer ambos strings desde el final
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Continuamos mientras haya dígitos por procesar en cualquier número o haya
        // carry
        while (i >= 0 || j >= 0 || carry == 1) {
            // Si quedan dígitos en 'a', sumamos al carry (convertimos char a int con - '0')
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            // Si quedan dígitos en 'b', sumamos al carry (convertimos char a int con - '0')
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            // carry % 2 nos da el bit actual (0 o 1):
            // - Si carry es 0 -> 0 % 2 = 0
            // - Si carry es 1 -> 1 % 2 = 1
            // - Si carry es 2 -> 2 % 2 = 0 (suma de 1+1 en binario)
            // - Si carry es 3 -> 3 % 2 = 1 (suma de 1+1+1 en binario)
            sb.append(carry % 2);

            // carry /= 2 determina si hay acarreo para la siguiente posición:
            // - Si carry era 0 o 1 -> carry = 0 (no hay acarreo)
            // - Si carry era 2 o 3 -> carry = 1 (hay acarreo)
            // Ejemplos:
            // - 2/2 = 1 (cuando sumamos 1+1 en binario)
            // - 3/2 = 1 (cuando sumamos 1+1+1 en binario)
            carry /= 2;
        }
        // Invertimos el string resultante ya que lo construimos al revés
        return sb.reverse().toString();
    }
}
