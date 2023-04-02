package leetcode.tree.binarytree.problem543;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiameterOfBinaryTreeTest {

    DiameterOfBinaryTree classObj = new DiameterOfBinaryTree();
    DiameterOfBinaryTreeRecursiveApproach classObj2 = new DiameterOfBinaryTreeRecursiveApproach();

    @Test
    void test_diameterOfBinaryTree_expect3_whenDiameterIs3() {
        TreeNode right3 = new TreeNode(5, null, null);
        TreeNode left3 = new TreeNode(4, null, null);
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(2, left3, right3);
        TreeNode tree = new TreeNode(1, left1, right1);

        Assertions.assertEquals(3, classObj.diameterOfBinaryTree(tree));
    }

    @Test
    void test_diameterOfBinaryTree_expect1_whenDiameterIs1() {
        TreeNode left1 = new TreeNode(2, null, null);
        TreeNode tree = new TreeNode(1, left1, null);

        Assertions.assertEquals(1, classObj.diameterOfBinaryTree(tree));
        Assertions.assertEquals(1, classObj2.diameterOfBinaryTree(tree));
    }

    @Test
    void test_diameterOfBinaryTree_expect0_whenOnlyRootNode() {
        TreeNode tree = new TreeNode(1, null, null);

        Assertions.assertEquals(0, classObj.diameterOfBinaryTree(tree));
        Assertions.assertEquals(0, classObj2.diameterOfBinaryTree(tree));
    }
}
