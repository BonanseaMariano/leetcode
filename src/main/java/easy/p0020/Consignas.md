# Paréntesis Válidos

## Descripción

Dada una cadena s que contiene solo los caracteres '(', ')', '{', '}', '[' y ']', determina si la cadena de entrada es válida.

Una cadena de entrada es válida si:

1. Los paréntesis abiertos deben cerrarse con el mismo tipo de paréntesis.
2. Los paréntesis abiertos deben cerrarse en el orden correcto.
3. Cada paréntesis de cierre tiene su correspondiente paréntesis de apertura del mismo tipo.

## Ejemplos

### Ejemplo 1:

- **Input**: s = "()"
- **Output**: true

### Ejemplo 2:

- **Input**: s = "()[]{}"
- **Output**: true

### Ejemplo 3:

- **Input**: s = "(]"
- **Output**: false

### Ejemplo 4:

- **Input**: s = "([)]"
- **Output**: false

## Restricciones

- 1 <= s.length <= 104
- s solo contiene los caracteres '(', ')', '{', '}', '[' y ']'
