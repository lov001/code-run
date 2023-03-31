package leetcode.tree.binarytree.problem404;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftLeavesSumTest {

    LeftLeavesSum classObj = new LeftLeavesSum();
    LeftLeavesSumRecursiveApproach classObj2 = new LeftLeavesSumRecursiveApproach();
    LeftLeavesSumRecursiveApproach2 classObj3 = new LeftLeavesSumRecursiveApproach2();

    @Test
    void test_sumOfLeftLeaves_expect24_whenLeftLeavesSumIs24() {
        TreeNode right3 = new TreeNode(7, null, null);
        TreeNode left3 = new TreeNode(15, null, null);
        TreeNode right1 = new TreeNode(20, left3, right3);
        TreeNode left1 = new TreeNode(9, null, null);
        TreeNode tree = new TreeNode(3, left1, right1);

        Assertions.assertEquals(24, classObj.sumOfLeftLeaves(tree));
        Assertions.assertEquals(24, classObj2.sumOfLeftLeaves(tree));
        Assertions.assertEquals(24, classObj3.sumOfLeftLeaves(tree));
    }

    @Test
    void test_sumOfLeftLeaves_expect0_whenOnlyRootNode() {
        TreeNode tree = new TreeNode(1, null, null);

        Assertions.assertEquals(0, classObj.sumOfLeftLeaves(tree));
        Assertions.assertEquals(0, classObj2.sumOfLeftLeaves(tree));
        Assertions.assertEquals(0, classObj3.sumOfLeftLeaves(tree));
    }
}
