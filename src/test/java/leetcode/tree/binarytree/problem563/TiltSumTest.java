package leetcode.tree.binarytree.problem563;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TiltSumTest {

    TiltSum classObj = new TiltSum();

    @Test
    void test_findTilt_expect1_whenAbsoluteSumIs1() {
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(2, null, null);
        TreeNode tree = new TreeNode(1, left1, right1);

        Assertions.assertEquals(1, classObj.findTilt(tree));
    }

    @Test
    void test_findTilt_expect15_whenAbsoluteSumIs15() {
        TreeNode right4 = new TreeNode(7, null, null);
        TreeNode right3 = new TreeNode(5, null, null);
        TreeNode left3 = new TreeNode(3, null, null);
        TreeNode right1 = new TreeNode(9, null, right4);
        TreeNode left1 = new TreeNode(2, left3, right3);
        TreeNode tree = new TreeNode(4, left1, right1);

        Assertions.assertEquals(15, classObj.findTilt(tree));
    }

    @Test
    void test_findTilt_expect9_whenAbsoluteSumIs9() {
        TreeNode right5 = new TreeNode(2, null, null);
        TreeNode left5 = new TreeNode(2, null, null);
        TreeNode right4 = new TreeNode(3, null, null);
        TreeNode left4 = new TreeNode(3, null, null);
        TreeNode right3 = new TreeNode(1, null, null);
        TreeNode left3 = new TreeNode(1, left4, right4);
        TreeNode right1 = new TreeNode(14, left5, right5);
        TreeNode left1 = new TreeNode(7, left3, right3);
        TreeNode tree = new TreeNode(21, left1, right1);

        Assertions.assertEquals(9, classObj.findTilt(tree));
    }
}
