package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxDepthOfBinaryTreeTest {

   MaxDepthOfBinaryTree classObj = new MaxDepthOfBinaryTree();

   @Test
   void test_maxDepth_expect3_whenNumberOfNodesIs5() {
      BinaryTreeNode left12 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode root = new BinaryTreeNode(3, left1, right1);
      Assertions.assertEquals(3, classObj.maxDepth(root));
   }

   @Test
   void test_maxDepth_expect2_whenNumberOfNodesIs2() {
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right1);
      Assertions.assertEquals(2, classObj.maxDepth(root));
   }
}
