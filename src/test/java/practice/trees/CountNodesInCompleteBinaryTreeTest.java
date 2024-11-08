package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountNodesInCompleteBinaryTreeTest {

   CountNodesInCompleteBinaryTree classObj = new CountNodesInCompleteBinaryTree();

   @Test
   void test_countNodes_expect4_whenGivenTree() {
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left3, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);
      Assertions.assertEquals(4, classObj.countNodes(tree));
   }

   @Test
   void test_countNodes_expect2_whenGivenTree() {
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, null);
      Assertions.assertEquals(2, classObj.countNodes(tree));
   }

   @Test
   void test_countNodes_expect8_whenGivenTree() {
      BinaryTreeNode left4 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(4, left4, null);
      BinaryTreeNode right1 = new BinaryTreeNode(2, left3, right3);
      BinaryTreeNode left1 = new BinaryTreeNode(1, left2, right2);
      BinaryTreeNode tree = new BinaryTreeNode(0, left1, right1);

      Assertions.assertEquals(8, classObj.countNodes(tree));
   }
}
