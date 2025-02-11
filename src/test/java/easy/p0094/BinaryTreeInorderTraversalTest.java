package easy.p0094;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import easy.p0094.BinaryTreeInorderTraversal.TreeNode;

class BinaryTreeInorderTraversalTest {
    private BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

    @Test
    void test1() {
        // Test case: [1,null,2,3]
        TreeNode root = solution.new TreeNode(1);
        root.right = solution.new TreeNode(2);
        root.right.left = solution.new TreeNode(3);

        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void test2() {
        // Test case: [1,2,3,4,5,null,8,null,null,6,7,9]
        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(3);
        root.left.left = solution.new TreeNode(4);
        root.left.right = solution.new TreeNode(5);
        root.right.right = solution.new TreeNode(8);
        root.left.right.left = solution.new TreeNode(6);
        root.left.right.right = solution.new TreeNode(7);
        root.right.right.left = solution.new TreeNode(9);

        List<Integer> expected = Arrays.asList(4, 2, 6, 5, 7, 1, 3, 9, 8);
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    void testEmpty() {
        // Test case: []
        assertEquals(Collections.emptyList(), solution.inorderTraversal(null));
    }

    @Test
    void testSingleNode() {
        // Test case: [1]
        TreeNode root = solution.new TreeNode(1);

        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, solution.inorderTraversal(root));
    }
}
