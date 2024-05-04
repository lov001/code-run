package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;
import practice.utils.BinaryTreeHeight;

public class BinaryTreeHeightTest {

   BinaryTreeHeight classObj = new BinaryTreeHeight();

   @Test
   void test_height_expect3_whenTreeIsBalanced() {
      BinaryTreeNode left3 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left3, right3);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

      Assertions.assertEquals(3, classObj.height(tree));
   }

   @Test
   void test_height_expect0_whenEmptyTree() {
      Assertions.assertEquals(-1, classObj.height(null));
   }

   @Test
   void test_height_expect4_whenDifferenceIs4() {
      BinaryTreeNode right3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(3, left3, right3);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      Assertions.assertEquals(4, classObj.height(tree));
   }

   @Test
   void test_height_expect4_whenDepthIs4() {
      BinaryTreeNode right3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, right3);
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(3, left3, null);
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, right2);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      Assertions.assertEquals(4, classObj.height(tree));
   }
}
