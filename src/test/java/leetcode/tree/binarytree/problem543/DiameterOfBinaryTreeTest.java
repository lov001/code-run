package leetcode.tree.binarytree.problem543;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiameterOfBinaryTreeTest {

    DiameterOfBinaryTree classObj = new DiameterOfBinaryTree();
    DiameterOfBinaryTreeRecursiveApproach classObj2 = new DiameterOfBinaryTreeRecursiveApproach();

    @Test
    void test_diameterOfBinaryTree_expect3_whenDiameterIs3() {
        BinaryTreeNode right3 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, left3, right3);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

        Assertions.assertEquals(3, classObj.diameterOfBinaryTree(tree));
    }

    @Test
    void test_diameterOfBinaryTree_expect1_whenDiameterIs1() {
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, null);

        Assertions.assertEquals(1, classObj.diameterOfBinaryTree(tree));
        Assertions.assertEquals(1, classObj2.diameterOfBinaryTree(tree));
    }

    @Test
    void test_diameterOfBinaryTree_expect0_whenOnlyRootNode() {
        BinaryTreeNode tree = new BinaryTreeNode(1, null, null);

        Assertions.assertEquals(0, classObj.diameterOfBinaryTree(tree));
        Assertions.assertEquals(0, classObj2.diameterOfBinaryTree(tree));
    }
}
