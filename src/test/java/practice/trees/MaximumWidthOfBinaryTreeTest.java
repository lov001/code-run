package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumWidthOfBinaryTreeTest {

   MaximumWidthOfBinaryTree classObj = new MaximumWidthOfBinaryTree();

   @Test
   void test_getMaxWidth_expect2_whenNumberOfNodes5() {
      BinaryTreeNode left13 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode right12 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left12 = new BinaryTreeNode(4, left13, right12);
      BinaryTreeNode right11 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(6, left12, right11);
      BinaryTreeNode root = new BinaryTreeNode(5, left1, right1);
      Assertions.assertEquals(2, classObj.getMaxWidth(root));
   }

   @Test
   void test_getMaxWidth_expect1_whenNumberOfNodes1() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);
      Assertions.assertEquals(1, classObj.getMaxWidth(root));
   }
}
