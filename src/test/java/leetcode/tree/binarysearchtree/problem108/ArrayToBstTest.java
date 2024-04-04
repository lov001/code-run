package leetcode.tree.binarysearchtree.problem108;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayToBstTest {

    ArrayToBst classObj = new ArrayToBst();

    @Test
    void test_sortedArrayToBST_expectBST_whenGivenArray() {
        int[] input = {-10, -3, 0, 5, 9};
        BinaryTreeNode right4 = new BinaryTreeNode(9, null, null);
        BinaryTreeNode right3 = new BinaryTreeNode(-3, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(5, null, right4);
        BinaryTreeNode left1 = new BinaryTreeNode(-10, null, right3);
        BinaryTreeNode tree = new BinaryTreeNode(0, left1, right1);
        BinaryTreeNode output = classObj.sortedArrayToBST(input);
        Assertions.assertEquals(tree.val, output.val);
        Assertions.assertEquals(tree.left.val, output.left.val);
        Assertions.assertEquals(tree.right.val, output.right.val);
        Assertions.assertEquals(tree.left.right.val, output.left.right.val);
        Assertions.assertEquals(tree.right.right.val, output.right.right.val);
    }

    @Test
    void test_sortedArrayToBST_expectBST_whenGivenArrayWith2Elements() {
        int[] input = {1, 3};
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(1, null, right1);
        BinaryTreeNode output = classObj.sortedArrayToBST(input);
        Assertions.assertEquals(tree.val, output.val);
        Assertions.assertEquals(tree.right.val, output.right.val);
    }
}
