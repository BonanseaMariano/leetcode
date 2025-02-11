Te explico paso a paso el algoritmo de la solución usando pila:

### Inicialización:
- Se inicializa una lista vacía `res` para almacenar el resultado (recorrido in-order)
- Se inicializa una pila vacía `stack` para el recorrido iterativo
```java
List<Integer> res = new ArrayList<>();
Stack<TreeNode> stack = new Stack<>();
```

### Bucle de Recorrido:
- Se inicia un bucle que continúa mientras el nodo actual (`root`) no sea null O la pila no esté vacía
- Este bucle maneja tanto el recorrido hacia el nodo más izquierdo como el retroceso al nodo padre
```java
while (root != null || !stack.isEmpty()) {
```

### Recorrer hasta el Nodo más Izquierdo:
- Dentro del bucle principal, se usa otro bucle anidado para recorrer hasta el nodo más izquierdo del subárbol actual
- Durante este proceso, cada nodo encontrado se apila en el stack
- Esto asegura que nos movamos lo más a la izquierda posible en el árbol
```java
while (root != null) {
    stack.push(root);
    root = root.left;
}
```

### Extraer Nodo de la Pila:
- Una vez que llegamos al nodo más izquierdo (o un nodo hoja), sacamos el último nodo de la pila
- Este nodo es el último visitado por la izquierda
```java
root = stack.pop();
```

### Agregar Valor del Nodo al Resultado:
- Agregamos el valor del nodo extraído a la lista de resultados
```java
res.add(root.val);
```

### Moverse al Subárbol Derecho:
- Nos movemos al subárbol derecho del nodo actual
```java
root = root.right;
```

### Fin del Bucle:
- El proceso se repite hasta que todos los nodos hayan sido procesados

### Retornar Lista de Resultados:
- Después de que el recorrido está completo, se retorna la lista final
```java
return res;
```

Este algoritmo realiza un recorrido in-order de un árbol binario de forma iterativa usando una pila. Simula el enfoque recursivo pero usa una pila para gestionar el estado del recorrido explícitamente. La idea central es ir lo más a la izquierda posible, visitar los nodos en el camino, retroceder al padre, y luego moverse al subárbol derecho. La pila ayuda a rastrear el proceso de retroceso.


----

Te muestro un ejemplo paso a paso con un árbol binario simple:

```
     1
    / \
   2   3
  /     \
 4       5
```

### Simulación del algoritmo:

1. **Inicio**:
   - `res = []` (lista vacía)
   - `stack = []` (pila vacía)
   - `root = 1` (nodo raíz)

2. **Primera iteración del bucle externo**:
   ```
   Bucle interno (root != null):
   - Apila 1: stack = [1]
   - Apila 2: stack = [1,2]
   - Apila 4: stack = [1,2,4]
   ```

3. **Procesamiento**:
   ```
   - Pop 4: stack = [1,2]  → res = [4]
   - root.right de 4 es null
   - Pop 2: stack = [1]    → res = [4,2]
   - root.right de 2 es null
   - Pop 1: stack = []     → res = [4,2,1]
   - root.right de 1 es 3
   ```

4. **Segunda iteración**:
   ```
   root = 3
   - Apila 3: stack = [3]
   - root.right es 5
   - Pop 3: stack = []     → res = [4,2,1,3]
   - root = 5
   - Apila 5: stack = [5]
   - Pop 5: stack = []     → res = [4,2,1,3,5]
   ```

5. **Resultado final**: `[4,2,1,3,5]`


Este es el recorrido in-order (izquierda-raíz-derecha) del árbol. Como puedes ver:
- Primero visita todo el camino izquierdo (4,2)
- Luego visita la raíz (1)
- Finalmente visita el subárbol derecho (3,5)