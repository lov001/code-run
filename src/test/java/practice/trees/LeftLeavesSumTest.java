package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftLeavesSumTest {
   SumOfLeftLeaves classObj = new SumOfLeftLeaves();

   @Test
   void test_sumOfLeftLeaves_expect24_whenLeftLeavesSumIs24() {
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left3, right3);
      BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

      Assertions.assertEquals(24, classObj.sumOfLeftLeaves(tree));
   }

   @Test
   void test_sumOfLeftLeaves_expect0_whenOnlyRootNode() {
      BinaryTreeNode tree = new BinaryTreeNode(1, null, null);

      Assertions.assertEquals(0, classObj.sumOfLeftLeaves(tree));
   }

   @Test
   void test_sumOfLeftLeaves_expect36_whenRandomTree() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);

      Assertions.assertEquals(36, classObj.sumOfLeftLeaves(tree1));
   }
}
