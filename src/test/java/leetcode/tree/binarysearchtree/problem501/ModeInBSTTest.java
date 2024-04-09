package leetcode.tree.binarysearchtree.problem501;

import java.util.Arrays;
import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModeInBSTTest {

    ModeInBST classObj = new ModeInBST();
    ModeInBSTApproach2 classObj2 = new ModeInBSTApproach2();


    @Test
    void test_findMode_expect2_whenModeIs2() {
        BinaryTreeNode left = new BinaryTreeNode(2, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(2, left, null);
        BinaryTreeNode tree = new BinaryTreeNode(1, null, right1);
        int[] output = {2};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(classObj.findMode(tree)));
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(classObj2.findMode(tree)));
    }

    @Test
    void test_findMode_expect0_whenOnlyRoot() {
        BinaryTreeNode tree = new BinaryTreeNode(0, null, null);
        int[] output = {0};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(classObj.findMode(tree)));
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(classObj2.findMode(tree)));
    }
}
