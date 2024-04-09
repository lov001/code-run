package leetcode.tree.binarytree.problem112;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumTest {

    PathSum classObj = new PathSum();
    PathSumIterativeSolution classObj2 = new PathSumIterativeSolution();

    @Test
    void test_hasPathSum_expectTrue_whenTargetSumIs22AndItExists() {
        BinaryTreeNode right4 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode right3 = new BinaryTreeNode(4, null, right4);
        BinaryTreeNode left3 = new BinaryTreeNode(13, null, null);
        BinaryTreeNode right2 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode left2 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode left20 = new BinaryTreeNode(11, left2, right2);
        BinaryTreeNode right1 = new BinaryTreeNode(8, left3, right3);
        BinaryTreeNode left1 = new BinaryTreeNode(4, left20, null);
        BinaryTreeNode tree = new BinaryTreeNode(5, left1, right1);

        Assertions.assertTrue(classObj.hasPathSum(tree, 22));
        Assertions.assertTrue(classObj2.hasPathSum(tree, 22));
    }

    @Test
    void test_hasPathSum_expectFalse_whenTargetSumIs5AndItDoesNotExists() {
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

        Assertions.assertFalse(classObj.hasPathSum(tree, 5));
        Assertions.assertFalse(classObj2.hasPathSum(tree, 5));
    }

    @Test
    void test_hasPathSum_expectFalse_whenTargetSumIs0AndTreeIsEmpty() {
        Assertions.assertFalse(classObj.hasPathSum(null, 0));
        Assertions.assertFalse(classObj2.hasPathSum(null, 0));
    }

    @Test
    void test_hasPathSum_expectFalse_whenTargetSumIs1AndItDoesNotExists() {
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, null);

        Assertions.assertFalse(classObj.hasPathSum(tree, 1));
        Assertions.assertFalse(classObj2.hasPathSum(tree, 1));
    }
}
