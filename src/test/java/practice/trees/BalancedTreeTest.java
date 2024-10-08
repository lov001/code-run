package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedTreeTest {

   BalancedBinaryTree classObj = new BalancedBinaryTree();

   @Test
   void test_isBalanced_expectTree_whenTreeIsBalanced() {
      BinaryTreeNode left3 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left3, right3);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

      Assertions.assertTrue(classObj.isBalanced(tree));
      Assertions.assertTrue(classObj.isBalancedOptimised(tree));
   }

   @Test
   void test_isBalanced_expectTrue_whenEmptyTree() {
      Assertions.assertTrue(classObj.isBalanced(null));
      Assertions.assertTrue(classObj.isBalancedOptimised(null));
   }

   @Test
   void test_isBalanced_expectFalse_whenDifferenceIs3_() {
      BinaryTreeNode right3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(3, left3, right3);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      Assertions.assertFalse(classObj.isBalanced(tree));
      Assertions.assertFalse(classObj.isBalancedOptimised(tree));
   }

   @Test
   void test_isBalanced_expectFalse_whenDepthIs3_() {
      BinaryTreeNode right3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, right3);
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(3, left3, null);
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, right2);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      Assertions.assertFalse(classObj.isBalanced(tree));
      Assertions.assertFalse(classObj.isBalancedOptimised(tree));
   }
}
