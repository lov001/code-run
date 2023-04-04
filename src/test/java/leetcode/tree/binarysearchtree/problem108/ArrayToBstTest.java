package leetcode.tree.binarysearchtree.problem108;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayToBstTest {

    ArrayToBst classObj = new ArrayToBst();

    @Test
    void test_sortedArrayToBST_expectBST_whenGivenArray() {
        int[] input = {-10, -3, 0, 5, 9};
        TreeNode right4 = new TreeNode(9, null, null);
        TreeNode right3 = new TreeNode(-3, null, null);
        TreeNode right1 = new TreeNode(5, null, right4);
        TreeNode left1 = new TreeNode(-10, null, right3);
        TreeNode tree = new TreeNode(0, left1, right1);
        TreeNode output = classObj.sortedArrayToBST(input);
        Assertions.assertEquals(tree.val, output.val);
        Assertions.assertEquals(tree.left.val, output.left.val);
        Assertions.assertEquals(tree.right.val, output.right.val);
        Assertions.assertEquals(tree.left.right.val, output.left.right.val);
        Assertions.assertEquals(tree.right.right.val, output.right.right.val);
    }

    @Test
    void test_sortedArrayToBST_expectBST_whenGivenArrayWith2Elements() {
        int[] input = {1, 3};
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode tree = new TreeNode(1, null, right1);
        TreeNode output = classObj.sortedArrayToBST(input);
        Assertions.assertEquals(tree.val, output.val);
        Assertions.assertEquals(tree.right.val, output.right.val);
    }
}
