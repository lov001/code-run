package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.utils.SortedArraysToBST;

public class ValidateBSTTest {

   ValidateBST classObj = new ValidateBST();

   @Test
   void test_isBST_expectTrue_whenBST() {
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
      BinaryTreeNode tree1 = SortedArraysToBST.transformArrayToBST(array);
      Assertions.assertTrue(classObj.isBST(tree1));
      Assertions.assertTrue(classObj.isBSTUsingInOrderTraversal(tree1));
      Assertions.assertTrue(classObj.isBSTUsingMinMax(tree1));
   }

   @Test
   void test_isBST_expectTrue_whenTreeIsABST() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);

      Assertions.assertTrue(classObj.isBST(tree1));
      Assertions.assertTrue(classObj.isBSTUsingInOrderTraversal(tree1));
      Assertions.assertTrue(classObj.isBSTUsingMinMax(tree1));
   }

   @Test
   void test_isBST_expectFalse_whenTreesNotABST() {
      BinaryTreeNode left12 = new BinaryTreeNode(32, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);
      Assertions.assertFalse(classObj.isBST(tree1));
      Assertions.assertFalse(classObj.isBSTUsingInOrderTraversal(tree1));
      Assertions.assertFalse(classObj.isBSTUsingMinMax(tree1));
   }

   @Test
   void test_isBST_expectFalse_whenNotABSTAt1stLevel() {
      BinaryTreeNode right1 = new BinaryTreeNode(12, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(14, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);
      Assertions.assertFalse(classObj.isBST(tree1));
      Assertions.assertFalse(classObj.isBSTUsingInOrderTraversal(tree1));
      Assertions.assertFalse(classObj.isBSTUsingMinMax(tree1));
   }
}
