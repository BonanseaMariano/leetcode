package easy.p0094;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Solución para el problema de LeetCode "Binary Tree Inorder Traversal"
 * https://leetcode.com/problems/binary-tree-inorder-traversal
 * 
 * Este problema requiere implementar un recorrido inorder
 * (izquierda-raíz-derecha)
 * de un árbol binario y retornar los valores de los nodos en el orden correcto.
 * 
 * Dificultad: Fácil
 * ID del Problema: 94
 * 
 * @author Mariano Bonansea
 */
public class BinaryTreeInorderTraversal {
    /** Definition for a binary tree node. **/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Implementa el recorrido inorder de forma iterativa usando una pila.
     * 
     * @param root La raíz del árbol binario
     * @return Lista con los valores de los nodos en orden inorder
     * 
     *         Ejemplo:
     *         Input: root = [1,null,2,3]
     *         Output: [1,3,2]
     * 
     *         Funcionamiento:
     *         - Utiliza una pila para simular la recursión
     *         - Primero procesa todo el subárbol izquierdo
     *         - Luego procesa el nodo actual
     *         - Finalmente procesa el subárbol derecho
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        // Continúa mientras haya nodos por procesar o la pila no esté vacía
        while (root != null || !stack.isEmpty()) {
            // Almacena todos los nodos izquierdos en la pila
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            // Procesa el nodo actual y mueve al subárbol derecho
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }

        return res;
    }

    // Solución recursiva
    // public List<Integer> inorderTraversal(TreeNode root) {
        // // Inicializa la lista de resultados
        // List<Integer> res = new ArrayList<>();
        // // Llama al método auxiliar recursivo
        // inorder(root, res);
        // return res;
    // }

    // private void inorder(TreeNode node, List<Integer> res) {
        // // Caso base: si el nodo es null, retorna
        // if (node == null) {
        //      return;
        // }
        // // Recorre primero el subárbol izquierdo
        // inorder(node.left, res);
        // // Procesa el nodo actual añadiéndolo a la lista
        // res.add(node.val);
        // // Finalmente recorre el subárbol derecho
        // inorder(node.right, res);
    // }
}
