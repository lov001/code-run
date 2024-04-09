package leetcode.tree.binarytree.problem104;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeDepthTest {

    BinaryTreeDepth classObj = new BinaryTreeDepth();
    BinaryTreeDepthIterativeApproach classObj2 = new BinaryTreeDepthIterativeApproach();
    BinaryTreeDepthIterativeApproachUsingStack classObj3 =
        new BinaryTreeDepthIterativeApproachUsingStack();

    @Test
    void test_maxDepth_expect3_whenDepthIs3() {
        BinaryTreeNode left3 = new BinaryTreeNode(15, null, null);
        BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(20, left3, right3);
        BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

        Assertions.assertEquals(3, classObj.maxDepth(tree));
        Assertions.assertEquals(3, classObj2.maxDepth(tree));
        Assertions.assertEquals(3, classObj3.maxDepth(tree));
    }

    @Test
    void test_maxDepth_expect2_whenDepthIs2() {
        BinaryTreeNode right1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(1, null, right1);

        Assertions.assertEquals(2, classObj.maxDepth(tree));
        Assertions.assertEquals(2, classObj2.maxDepth(tree));
        Assertions.assertEquals(2, classObj3.maxDepth(tree));
    }

    @Test
    void test_maxDepth_expect3_whenDepthIs3_() {
        BinaryTreeNode right3 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, left3, null);
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, right3);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

        Assertions.assertEquals(3, classObj.maxDepth(tree));
        Assertions.assertEquals(3, classObj2.maxDepth(tree));
        Assertions.assertEquals(3, classObj3.maxDepth(tree));
    }
}
