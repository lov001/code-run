package leetcode.tree.binarytree.problem111;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDepthTest {

    MinimumDepth classObj = new MinimumDepth();
    MinimumDepthIterativeApproach classObj2 = new MinimumDepthIterativeApproach();

    @Test
    void test_minDepth_expect2_whenMinimumDepthIs2() {
        BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode left3 = new BinaryTreeNode(15, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(20, left3, right3);
        BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

        Assertions.assertEquals(2, classObj.minDepth(tree));
        Assertions.assertEquals(2, classObj2.minDepth(tree));
    }

    @Test
    void test_minDepth_expect5_whenMinimumDepthIs5() {
        BinaryTreeNode right5 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode right4 = new BinaryTreeNode(5, null, right5);
        BinaryTreeNode right3 = new BinaryTreeNode(4, null, right4);
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, right3);
        BinaryTreeNode tree = new BinaryTreeNode(2, null, right1);

        Assertions.assertEquals(5, classObj.minDepth(tree));
        Assertions.assertEquals(5, classObj2.minDepth(tree));
    }

    @Test
    void test_minDepth_expect3_whenMinimumDepthIs3() {
        BinaryTreeNode left6 = new BinaryTreeNode(-5, null, null);
        BinaryTreeNode left5 = new BinaryTreeNode(-6, null, null);
        BinaryTreeNode right4 = new BinaryTreeNode(0, null, null);
        BinaryTreeNode right3 = new BinaryTreeNode(4, left6, null);
        BinaryTreeNode left3 = new BinaryTreeNode(4, left5, null);
        BinaryTreeNode right1 = new BinaryTreeNode(2, left3, right4);
        BinaryTreeNode left1 = new BinaryTreeNode(-3, null, right3);
        BinaryTreeNode tree = new BinaryTreeNode(-9, left1, right1);

        Assertions.assertEquals(3, classObj.minDepth(tree));
        Assertions.assertEquals(3, classObj2.minDepth(tree));
    }
}
