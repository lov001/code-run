package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class LargestBstInBinaryTreeTest {

   LargestBstInBinaryTree classObj = new LargestBstInBinaryTree();

   @Test
   void test_largestBST_expect3_whenTreeWith5Nodes() {
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(5, left1, right1);
      Assertions.assertEquals(3, classObj.largestBST(tree));
   }

   @Test
   void test_largestBST_expect3_whenTreeWith3Nodes() {
      BinaryTreeNode left1 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(2, left1, right1);
      Assertions.assertEquals(3, classObj.largestBST(tree));
   }
}
