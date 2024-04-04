package leetcode.tree.binarytree.problem563;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TiltSumTest {

    TiltSum classObj = new TiltSum();

    @Test
    void test_findTilt_expect1_whenAbsoluteSumIs1() {
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

        Assertions.assertEquals(1, classObj.findTilt(tree));
    }

    @Test
    void test_findTilt_expect15_whenAbsoluteSumIs15() {
        BinaryTreeNode right4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode right3 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode left3 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(9, null, right4);
        BinaryTreeNode left1 = new BinaryTreeNode(2, left3, right3);
        BinaryTreeNode tree = new BinaryTreeNode(4, left1, right1);

        Assertions.assertEquals(15, classObj.findTilt(tree));
    }

    @Test
    void test_findTilt_expect9_whenAbsoluteSumIs9() {
        BinaryTreeNode right5 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode left5 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode right4 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left4 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode right3 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode left3 = new BinaryTreeNode(1, left4, right4);
        BinaryTreeNode right1 = new BinaryTreeNode(14, left5, right5);
        BinaryTreeNode left1 = new BinaryTreeNode(7, left3, right3);
        BinaryTreeNode tree = new BinaryTreeNode(21, left1, right1);

        Assertions.assertEquals(9, classObj.findTilt(tree));
    }
}
