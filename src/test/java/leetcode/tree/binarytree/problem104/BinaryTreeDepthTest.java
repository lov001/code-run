package leetcode.tree.binarytree.problem104;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeDepthTest {

    BinaryTreeDepth classObj = new BinaryTreeDepth();

    @Test
    void test_maxDepth_expect3_whenDepthIs3() {
        TreeNode left3 = new TreeNode(15, null, null);
        TreeNode right3 = new TreeNode(7, null, null);
        TreeNode left1 = new TreeNode(9, null, null);
        TreeNode right1 = new TreeNode(20, left3, right3);
        TreeNode tree = new TreeNode(3, left1, right1);

        Assertions.assertEquals(3, classObj.maxDepth(tree));
    }

    @Test
    void test_maxDepth_expect2_whenDepthIs2() {
        TreeNode right1 = new TreeNode(2, null, null);
        TreeNode tree = new TreeNode(1, null, right1);

        Assertions.assertEquals(2, classObj.maxDepth(tree));
    }
}
