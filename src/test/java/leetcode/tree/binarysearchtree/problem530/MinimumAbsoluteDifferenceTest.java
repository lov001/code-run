package leetcode.tree.binarysearchtree.problem530;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumAbsoluteDifferenceTest {

    MinimumAbsoluteDifference classObj = new MinimumAbsoluteDifference();
    MinimumAbsoluteDifferenceWithoutList classObj2 = new MinimumAbsoluteDifferenceWithoutList();

    @Test
    void tes_getMinimumDifference_expect1_whenMinimumAbsoluteDifferenceIs1() {
        TreeNode right2 = new TreeNode(3, null, null);
        TreeNode left2 = new TreeNode(1, null, null);
        TreeNode right1 = new TreeNode(6, null, null);
        TreeNode left1 = new TreeNode(2, left2, right2);
        TreeNode tree = new TreeNode(4, left1, right1);
        Assertions.assertEquals(1, classObj.getMinimumDifference(tree));
        Assertions.assertEquals(1, classObj2.getMinimumDifference(tree));
    }

    @Test
    void tes_getMinimumDifference_expect1_whenMinimumAbsoluteDifferenceIs1_() {
        TreeNode right2 = new TreeNode(49, null, null);
        TreeNode left2 = new TreeNode(12, null, null);
        TreeNode right1 = new TreeNode(0, null, null);
        TreeNode left1 = new TreeNode(48, left2, right2);
        TreeNode tree = new TreeNode(1, right1, left1);
        Assertions.assertEquals(1, classObj.getMinimumDifference(tree));
        Assertions.assertEquals(1, classObj2.getMinimumDifference(tree));
    }
}
