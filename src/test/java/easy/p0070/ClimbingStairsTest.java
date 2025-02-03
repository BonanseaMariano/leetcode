package easy.p0070;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    void testEjemplosDocumentados() {
        // Ejemplo 1 de la consigna
        assertEquals(2, solution.climbStairs(2));

        // Ejemplo 2 de la consigna
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    void testCasosLimite() {
        // Prueba el límite inferior según restricciones (n = 1)
        assertEquals(1, solution.climbStairs(1));

        // Prueba un valor cercano al límite superior (n = 45)
        assertEquals(1836311903, solution.climbStairs(45));
    }

    @Test
    void testCasosIntermedios() {
        // Casos intermedios para verificar la secuencia
        assertEquals(5, solution.climbStairs(4));
        assertEquals(8, solution.climbStairs(5));
        assertEquals(13, solution.climbStairs(6));
        assertEquals(21, solution.climbStairs(7));
    }
}
