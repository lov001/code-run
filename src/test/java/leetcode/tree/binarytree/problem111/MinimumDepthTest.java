package leetcode.tree.binarytree.problem111;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDepthTest {

    MinimumDepth classObj = new MinimumDepth();

    @Test
    void test_minDepth_expect2_whenMinimumDepthIs2() {
        TreeNode right3 = new TreeNode(7, null, null);
        TreeNode left3 = new TreeNode(15, null, null);
        TreeNode right1 = new TreeNode(20, left3, right3);
        TreeNode left1 = new TreeNode(9, null, null);
        TreeNode tree = new TreeNode(3, left1, right1);

        Assertions.assertEquals(2, classObj.minDepth(tree));
    }

    @Test
    void test_minDepth_expect5_whenMinimumDepthIs5() {
        TreeNode right5 = new TreeNode(4, null, null);
        TreeNode right4 = new TreeNode(5, null, right5);
        TreeNode right3 = new TreeNode(4, null, right4);
        TreeNode right1 = new TreeNode(3, null, right3);
        TreeNode tree = new TreeNode(2, null, right1);

        Assertions.assertEquals(5, classObj.minDepth(tree));
    }

    @Test
    void test_minDepth_expect3_whenMinimumDepthIs3() {
        TreeNode left6 = new TreeNode(-5, null, null);
        TreeNode left5 = new TreeNode(-6, null, null);
        TreeNode right4 = new TreeNode(0, null, null);
        TreeNode right3 = new TreeNode(4, left6, null);
        TreeNode left3 = new TreeNode(4, left5, null);
        TreeNode right1 = new TreeNode(2, left3, right4);
        TreeNode left1 = new TreeNode(-3, null, right3);
        TreeNode tree = new TreeNode(-9, left1, right1);

        Assertions.assertEquals(3, classObj.minDepth(tree));
    }
}
