package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiameterOfBinaryTreeTest {

   DiameterOfBinaryTree classObj = new DiameterOfBinaryTree();

   @Test
   void test_diameterOfBinaryTree_expect3_whenNumberOfNodes5() {
      BinaryTreeNode left12 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left12, right11);
      BinaryTreeNode root = new BinaryTreeNode(1, left1, right1);
      Assertions.assertEquals(3, classObj.diameterOfBinaryTree(root));
   }

   @Test
   void test_diameterOfBinaryTree_expect1_whenNumberOfNodes2() {
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode root = new BinaryTreeNode(1, left1, null);
      Assertions.assertEquals(1, classObj.diameterOfBinaryTree(root));
   }
}
