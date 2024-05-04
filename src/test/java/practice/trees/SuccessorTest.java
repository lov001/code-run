package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SuccessorTest {

   Successor classObj = new Successor();

   @Test
   void test_successor_expect28_whenCurrentNodeIsRootNode() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree = new BinaryTreeNode(25, left1, right1);

      Assertions.assertEquals(left12, classObj.successor(tree, tree));
   }

   @Test
   void test_successor_expect14_whenCurrentNodeIsLeftMostNode() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree = new BinaryTreeNode(25, left1, right1);

      Assertions.assertEquals(left1, classObj.successor(tree, left11));
   }

   @Test
   void test_successor_expectNull_whenCurrentNodeIsRightMostNode() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree = new BinaryTreeNode(25, left1, right1);

      Assertions.assertNull(classObj.successor(tree, right11));
   }

   @Test
   void test_successor_expect25_whenCurrentNodeIsRightMostNodeOnLeftSubtree() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode right113 = new BinaryTreeNode(20, null, null);
      BinaryTreeNode left112 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right112 = new BinaryTreeNode(16, left112, right113);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, right112);
      BinaryTreeNode tree = new BinaryTreeNode(25, left1, right1);

      Assertions.assertEquals(tree, classObj.successor(tree, right113));
   }
}
