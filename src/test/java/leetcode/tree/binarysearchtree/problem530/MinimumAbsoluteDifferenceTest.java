package leetcode.tree.binarysearchtree.problem530;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumAbsoluteDifferenceTest {

    MinimumAbsoluteDifference classObj = new MinimumAbsoluteDifference();
    MinimumAbsoluteDifferenceWithoutList classObj2 = new MinimumAbsoluteDifferenceWithoutList();

    @Test
    void tes_getMinimumDifference_expect1_whenMinimumAbsoluteDifferenceIs1() {
        BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
        BinaryTreeNode tree = new BinaryTreeNode(4, left1, right1);
        Assertions.assertEquals(1, classObj.getMinimumDifference(tree));
        Assertions.assertEquals(1, classObj2.getMinimumDifference(tree));
    }

    @Test
    void tes_getMinimumDifference_expect1_whenMinimumAbsoluteDifferenceIs1_() {
        BinaryTreeNode right2 = new BinaryTreeNode(49, null, null);
        BinaryTreeNode left2 = new BinaryTreeNode(12, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(0, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(48, left2, right2);
        BinaryTreeNode tree = new BinaryTreeNode(1, right1, left1);
        Assertions.assertEquals(1, classObj.getMinimumDifference(tree));
        Assertions.assertEquals(1, classObj2.getMinimumDifference(tree));
    }
}
