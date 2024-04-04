package leetcode.tree.binarytree.problem404;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftLeavesSumTest {

    LeftLeavesSum classObj = new LeftLeavesSum();
    LeftLeavesSumRecursiveApproach classObj2 = new LeftLeavesSumRecursiveApproach();
    LeftLeavesSumRecursiveApproach2 classObj3 = new LeftLeavesSumRecursiveApproach2();

    @Test
    void test_sumOfLeftLeaves_expect24_whenLeftLeavesSumIs24() {
        BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode left3 = new BinaryTreeNode(15, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(20, left3, right3);
        BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

        Assertions.assertEquals(24, classObj.sumOfLeftLeaves(tree));
        Assertions.assertEquals(24, classObj2.sumOfLeftLeaves(tree));
        Assertions.assertEquals(24, classObj3.sumOfLeftLeaves(tree));
    }

    @Test
    void test_sumOfLeftLeaves_expect0_whenOnlyRootNode() {
        BinaryTreeNode tree = new BinaryTreeNode(1, null, null);

        Assertions.assertEquals(0, classObj.sumOfLeftLeaves(tree));
        Assertions.assertEquals(0, classObj2.sumOfLeftLeaves(tree));
        Assertions.assertEquals(0, classObj3.sumOfLeftLeaves(tree));
    }
}
