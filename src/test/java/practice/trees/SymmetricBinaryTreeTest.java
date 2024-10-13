package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricBinaryTreeTest {

   SymmetricBinaryTree classObj = new SymmetricBinaryTree();

   @Test
   void test_isSymmetric_expectTree_whenTreeIsSymmetric() {
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left4 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right4 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left4, right4);
      BinaryTreeNode right1 = new BinaryTreeNode(2, left3, right3);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      Assertions.assertTrue(classObj.isSymmetric(tree));
   }

   @Test
   void test_isSymmetric_expectTrue_whenEmptyTree() {
      Assertions.assertTrue(classObj.isSymmetric(null));
   }

   @Test
   void test_isSymmetric_expectFalse_whenDifferenceIs3_() {
      BinaryTreeNode right3 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, right3);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      Assertions.assertFalse(classObj.isSymmetric(tree));
   }
}
