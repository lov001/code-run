package leetcode.tree.binarysearchtree.problem501;

import java.util.Arrays;
import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModeInBSTTest {

    ModeInBST classObj = new ModeInBST();


    @Test
    void test_findMode_expect2_whenModeIs2() {
        TreeNode left = new TreeNode(2, null, null);
        TreeNode right1 = new TreeNode(2, left, null);
        TreeNode tree = new TreeNode(1, null, right1);
        int[] output = {2};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(classObj.findMode(tree)));
    }

    @Test
    void test_findMode_expect0_whenOnlyRoot() {
        TreeNode tree = new TreeNode(0, null, null);
        int[] output = {0};
        Assertions.assertEquals(Arrays.toString(output), Arrays.toString(classObj.findMode(tree)));
    }
}
