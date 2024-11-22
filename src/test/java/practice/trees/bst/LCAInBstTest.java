package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class LCAInBstTest {

   LCAInBst classObj = new LCAInBst();

   @Test
   void test_LCAinaBST_expectFalse_whenTreeDoesNotContainNode() {
      BinaryTreeNode left2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(4, left2, null);
      BinaryTreeNode tree = new BinaryTreeNode(2, left1, right1);
      BinaryTreeNode actual = classObj.LCAinaBST(tree, left1, left2);
      Assertions.assertEquals(tree, actual);
   }

   @Test
   void test_LCAinaBST_expectFalse_whenEmptyTree() {
      BinaryTreeNode left2 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, left2);
      BinaryTreeNode tree = new BinaryTreeNode(2, left1, right1);
      BinaryTreeNode actual = classObj.LCAinaBST(tree, right1, left2);
      Assertions.assertEquals(right1, actual);
   }

   @Test
   void test_LCAinaBST_expectTrue_whenDifferenceIs3_() {
      BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, null);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, null);
      BinaryTreeNode actual = classObj.LCAinaBST(tree, left1, left2);
      Assertions.assertEquals(left1, actual);
   }

   @Test
   void test_LCAinaBSTIterative_expectFalse_whenTreeDoesNotContainNode() {
      BinaryTreeNode left2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(4, left2, null);
      BinaryTreeNode tree = new BinaryTreeNode(2, left1, right1);
      BinaryTreeNode actual = classObj.LCAinaBSTIterative(tree, left1, left2);
      Assertions.assertEquals(tree, actual);
   }

   @Test
   void test_LCAinaBSTIterative_expectFalse_whenEmptyTree() {
      BinaryTreeNode left2 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, left2);
      BinaryTreeNode tree = new BinaryTreeNode(2, left1, right1);
      BinaryTreeNode actual = classObj.LCAinaBSTIterative(tree, right1, left2);
      Assertions.assertEquals(right1, actual);
   }

   @Test
   void test_LCAinaBSTIterative_expectTrue_whenDifferenceIs3_() {
      BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, null);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, null);
      BinaryTreeNode actual = classObj.LCAinaBSTIterative(tree, left1, left2);
      Assertions.assertEquals(left1, actual);
   }
}
