package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructBinaryTreeFromInorderAndPreOrderTest {

   ConstructBinaryTreeFromInorderAndPreOrder classObj = new ConstructBinaryTreeFromInorderAndPreOrder();

   @Test
   void test_buildBinaryTree_expectT1_whenGivenTraversals() {
      int[] preOrder = {1, 2, 4, 7, 3};
      int[] inorder = {4, 2, 7, 1, 3};
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left3, right3);
      BinaryTreeNode expected = new BinaryTreeNode(1, left1, right1);
      BinaryTreeNode actual = classObj.buildBinaryTree(inorder, preOrder);
      Assertions.assertEquals(expected.data, actual.data);
      Assertions.assertEquals(expected.left.data, actual.left.data);
      Assertions.assertEquals(expected.right.data, actual.right.data);
      Assertions.assertEquals(expected.left.left.data, actual.left.left.data);
      Assertions.assertEquals(expected.left.right.data, actual.left.right.data);
   }

   @Test
   void test_buildBinaryTree_expectT2_whenGivenTraversals() {
      int[] preOrder = {1, 2};
      int[] inorder = {2, 1};
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode expected = new BinaryTreeNode(1, left1, null);
      BinaryTreeNode actual = classObj.buildBinaryTree(inorder, preOrder);
      Assertions.assertEquals(expected.data, actual.data);
      Assertions.assertEquals(expected.left.data, actual.left.data);
   }
}
