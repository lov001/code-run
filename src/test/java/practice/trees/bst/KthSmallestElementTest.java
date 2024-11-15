package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class KthSmallestElementTest {

   KthSmallestElement classObj = new KthSmallestElement();

   @Test
   void test_kthSmallest_expect4_whenKIs3() {
      BinaryTreeNode right4 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(6, right4, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(2, null, right2);
      BinaryTreeNode left1 = new BinaryTreeNode(4, left2, null);
      BinaryTreeNode right1 = new BinaryTreeNode(8, left3, right3);
      BinaryTreeNode tree = new BinaryTreeNode(5, left1, right1);
      Assertions.assertEquals(4, classObj.kthSmallest(tree, 3));
      Assertions.assertEquals(4, classObj.kthSmallestOptimised(tree, 3));
   }

   @Test
   void test_kthSmallest_expect10_whenKIs8() {
      BinaryTreeNode right4 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(6, right4, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(2, null, right2);
      BinaryTreeNode left1 = new BinaryTreeNode(4, left2, null);
      BinaryTreeNode right1 = new BinaryTreeNode(8, left3, right3);
      BinaryTreeNode tree = new BinaryTreeNode(5, left1, right1);
      Assertions.assertEquals(10, classObj.kthSmallest(tree, 8));
      Assertions.assertEquals(10, classObj.kthSmallestOptimised(tree, 8));
   }
}
