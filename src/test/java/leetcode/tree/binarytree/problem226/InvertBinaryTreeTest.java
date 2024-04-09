package leetcode.tree.binarytree.problem226;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    InvertBinaryTree classObj = new InvertBinaryTree();
    InvertBinaryTreeIterativeApproach classObj2 = new InvertBinaryTreeIterativeApproach();

    @Test
    void test_invertTree_expectInvertedTree_whenGivenTree() {
        BinaryTreeNode right3 = new BinaryTreeNode(9, null, null);
        BinaryTreeNode left3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(7, left3, right3);
        BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
        BinaryTreeNode tree = new BinaryTreeNode(4, left1, right1);

        BinaryTreeNode rightO1 = new BinaryTreeNode(2, right2, left2);
        BinaryTreeNode leftO1 = new BinaryTreeNode(7, right3, left3);
        BinaryTreeNode output = tree;
        output.left = leftO1;
        output.right = rightO1;
        Assertions.assertEquals(output, classObj.invertTree(tree));
        Assertions.assertEquals(output, classObj2.invertTree(tree));
    }

    @Test
    void test_invertTree_expectInvertedTree_whenGivenTree_() {
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(2, left1, right1);

        BinaryTreeNode output = tree;
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
