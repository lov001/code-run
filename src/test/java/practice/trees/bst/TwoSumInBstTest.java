package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class TwoSumInBstTest {

   TwoSumInBst classObj = new TwoSumInBst();

   @Test
   void test_twoSumInBST_expectTrue_whenTargetIs14() {
      BinaryTreeNode left4 = new BinaryTreeNode(11, null, null);
      BinaryTreeNode right4 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(6, left3, right3);
      BinaryTreeNode right1 = new BinaryTreeNode(12, left4, right4);
      BinaryTreeNode tree = new BinaryTreeNode(10, left1, right1);

      Assertions.assertTrue(classObj.twoSumInBST(tree, 14));
   }

   @Test
   void test_twoSumInBST_expectFalse_whenTargetIs20() {
      BinaryTreeNode left3 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(7, left3, right3);
      BinaryTreeNode tree = new BinaryTreeNode(5, left1, right1);

      Assertions.assertFalse(classObj.twoSumInBST(tree, 20));
   }
}
