package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumPathSumTest {

   MaximumPathSum classObj = new MaximumPathSum();

   @Test
   void test_maxPathSum_expect42_whenNumberOfNodes5() {
      BinaryTreeNode left12 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode root = new BinaryTreeNode(-10, left1, right1);
      Assertions.assertEquals(42, classObj.maxPathSum(root));
   }

   @Test
   void test_maxPathSum_expect6_whenNumberOfNodes3() {
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode root = new BinaryTreeNode(1, left1, right1);
      Assertions.assertEquals(6, classObj.maxPathSum(root));
   }

   @Test
   void test_maxPathSum_expect2_whenNumberOfNodes2() {
      BinaryTreeNode left1 = new BinaryTreeNode(-1, null, null);
      BinaryTreeNode root = new BinaryTreeNode(2, left1, null);
      Assertions.assertEquals(2, classObj.maxPathSum(root));
   }

   @Test
   void test_maxPathSum_expectMinus3_whenNumberOfNodes1() {
      BinaryTreeNode root = new BinaryTreeNode(-3, null, null);
      Assertions.assertEquals(-3, classObj.maxPathSum(root));
   }
}
