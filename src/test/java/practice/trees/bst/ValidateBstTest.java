package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class ValidateBstTest {

   ValidateBst classObj = new ValidateBst();

   @Test
   void test_validateBST_expectTrue_whenTreeIsBST() {
      BinaryTreeNode left3 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left3, right3);
      BinaryTreeNode right1 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(4, left1, right1);

      Assertions.assertTrue(classObj.validateBST(tree));
   }

   @Test
   void test_validateBST_expectTrue_whenEmptyTree() {
      Assertions.assertTrue(classObj.validateBST(null));
   }

   @Test
   void test_validateBST_expectTrue_whenTreeIsValidBST() {
      BinaryTreeNode right2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(1, null, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

      Assertions.assertTrue(classObj.validateBST(tree));
   }

   @Test
   void test_validateBST_expectFalse_whenTreeIsNotBST() {
      BinaryTreeNode left3 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left3, right3);
      BinaryTreeNode right1 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

      Assertions.assertFalse(classObj.validateBST(tree));
   }
}
