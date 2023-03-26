package leetcode.tree.binarytree.problem112;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumTest {

    PathSum classObj = new PathSum();

    @Test
    void test_hasPathSum_expectTrue_whenTargetSumIs22AndItExists() {
        TreeNode right4 = new TreeNode(1, null, null);
        TreeNode right3 = new TreeNode(4, null, right4);
        TreeNode left3 = new TreeNode(13, null, null);
        TreeNode right2 = new TreeNode(2, null, null);
        TreeNode left2 = new TreeNode(7, null, null);
        TreeNode left20 = new TreeNode(11, left2, right2);
        TreeNode right1 = new TreeNode(8, left3, right3);
        TreeNode left1 = new TreeNode(4, left20, null);
        TreeNode tree = new TreeNode(5, left1, right1);

        Assertions.assertTrue(classObj.hasPathSum(tree, 22));
    }

    @Test
    void test_hasPathSum_expectFalse_whenTargetSumIs5AndItDoesNotExists() {
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(2, null, null);
        TreeNode tree = new TreeNode(1, left1, right1);

        Assertions.assertFalse(classObj.hasPathSum(tree, 5));
    }

    @Test
    void test_hasPathSum_expectFalse_whenTargetSumIs0AndTreeIsEmpty() {
        Assertions.assertFalse(classObj.hasPathSum(null, 0));
    }
}
