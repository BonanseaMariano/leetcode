# Soluciones de Ejercicios LeetCode

Este repositorio contiene mis soluciones a diversos problemas de LeetCode implementadas en Java. Cada solución incluye explicaciones detalladas a través de comentarios para facilitar la comprensión del código.

## 🎯 Propósito

El objetivo de este repositorio es:
- Documentar mi progreso en la resolución de problemas de programación
- Proporcionar soluciones explicadas paso a paso
- Crear una referencia útil para otros desarrolladores

## 📁 Estructura del Proyecto

Las soluciones están organizadas de la siguiente manera:
```
leetcodeexercises/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── easy/       # Problemas de dificultad fácil
│   │       ├── medium/     # Problemas de dificultad media
│   │       └── hard/       # Problemas de dificultad difícil
│   └── test/
│       └── java/
│           ├── easy/       # Tests para problemas fáciles
│           ├── medium/     # Tests para problemas medios
│           └── hard/       # Tests para problemas difíciles
```

## 🧪 Tests

Cada solución viene acompañada de sus pruebas unitarias ubicadas en su paquete correspondiente dentro de `src/test/java`:
- Implementadas con JUnit 5
- Cubren múltiples casos de uso
- Aseguran la correctitud de la solución

## 🔍 Navegación

Los problemas están organizados por nivel de dificultad (easy, medium, hard). Dentro de cada nivel, encontrarás paquetes con el formato `p{número}`, donde el número corresponde al identificador del problema en LeetCode.

Cada paquete contiene:
- Un archivo `Consignas.md` con el enunciado del problema
- Un archivo `.java` con la solución implementada y comentada

Estructura de ejemplo:
```
easy/
├── p0001/
│   ├── Consignas.md          # Enunciado de Two Sum
│   └── TwoSum.java        # Solución implementada
├── p0009/
│   ├── Consignas.md          # Enunciado de Palindrome Number
│   └── PalindromeNumber.java
```
