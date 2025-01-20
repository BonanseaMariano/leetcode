# Número Palíndromo

## Descripción

Un número es palíndromo cuando se lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo, 121 es un palíndromo mientras que 123 no lo es.

## Problema

Dado un número entero x, determina si es un palíndromo.

### Ejemplos

#### Ejemplo 1:

- **Entrada**: x = 121
- **Salida**: true
- **Explicación**: 121 se lee igual de izquierda a derecha y de derecha a izquierda.

#### Ejemplo 2:

- **Entrada**: x = -121
- **Salida**: false
- **Explicación**: De izquierda a derecha se lee -121. De derecha a izquierda se convierte en 121-. Por lo tanto, no es un palíndromo.

#### Ejemplo 3:

- **Entrada**: x = 10
- **Salida**: false
- **Explicación**: Se lee como 01 de derecha a izquierda. Por lo tanto, no es un palíndromo.

## Restricciones

- -2³¹ ≤ x ≤ 2³¹ - 1