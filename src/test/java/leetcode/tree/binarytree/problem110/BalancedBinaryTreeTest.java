package leetcode.tree.binarytree.problem110;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBinaryTreeTest {

    BalancedBinaryTree classObj = new BalancedBinaryTree();

    @Test
    void test_isBalanced_expectTree_whenTreeIsBalanced() {
        TreeNode left3 = new TreeNode(15, null, null);
        TreeNode right3 = new TreeNode(7, null, null);
        TreeNode left1 = new TreeNode(9, null, null);
        TreeNode right1 = new TreeNode(20, left3, right3);
        TreeNode tree = new TreeNode(3, left1, right1);

        Assertions.assertTrue(classObj.isBalanced(tree));
    }

    @Test
    void test_isBalanced_expectTrue_whenEmptyTree() {
        Assertions.assertTrue(classObj.isBalanced(null));
    }

    @Test
    void test_isBalanced_expectFalse_whenDifferenceIs3_() {
        TreeNode right3 = new TreeNode(4, null, null);
        TreeNode right2 = new TreeNode(3, null, null);
        TreeNode left3 = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(3, left3, right3);
        TreeNode left1 = new TreeNode(2, left2, right2);
        TreeNode right1 = new TreeNode(2, null, null);
        TreeNode tree = new TreeNode(1, left1, right1);

        Assertions.assertFalse(classObj.isBalanced(tree));
    }

    @Test
    void test_isBalanced_expectFalse_whenDepthIs3_() {
        TreeNode right3 = new TreeNode(4, null, null);
        TreeNode right2 = new TreeNode(3, null, right3);
        TreeNode left3 = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(3, left3, null);
        TreeNode right1 = new TreeNode(2, null, right2);
        TreeNode left1 = new TreeNode(2, left2, null);
        TreeNode tree = new TreeNode(1, left1, right1);

        Assertions.assertFalse(classObj.isBalanced(tree));
    }
}
