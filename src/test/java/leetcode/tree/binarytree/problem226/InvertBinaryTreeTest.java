package leetcode.tree.binarytree.problem226;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    InvertBinaryTree classObj = new InvertBinaryTree();
    InvertBinaryTreeIterativeApproach classObj2 = new InvertBinaryTreeIterativeApproach();

    @Test
    void test_invertTree_expectInvertedTree_whenGivenTree() {
        TreeNode right3 = new TreeNode(9, null, null);
        TreeNode left3 = new TreeNode(6, null, null);
        TreeNode right2 = new TreeNode(3, null, null);
        TreeNode left2 = new TreeNode(1, null, null);
        TreeNode right1 = new TreeNode(7, left3, right3);
        TreeNode left1 = new TreeNode(2, left2, right2);
        TreeNode tree = new TreeNode(4, left1, right1);

        TreeNode rightO1 = new TreeNode(2, right2, left2);
        TreeNode leftO1 = new TreeNode(7, right3, left3);
        TreeNode output = tree;
        output.left = leftO1;
        output.right = rightO1;
        Assertions.assertEquals(output, classObj.invertTree(tree));
        Assertions.assertEquals(output, classObj2.invertTree(tree));
    }

    @Test
    void test_invertTree_expectInvertedTree_whenGivenTree_() {
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(1, null, null);
        TreeNode tree = new TreeNode(2, left1, right1);

        TreeNode output = tree;
        output.left = right1;
        output.right = left1;

        Assertions.assertEquals(output, classObj.invertTree(tree));
        Assertions.assertEquals(output, classObj2.invertTree(tree));
    }

    @Test
    void test_invertTree_expectInvertedTree_whenGivenTreeIsEmpty() {
        Assertions.assertNull(classObj.invertTree(null));
        Assertions.assertNull(classObj2.invertTree(null));
    }
}
