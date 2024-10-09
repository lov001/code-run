package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIdenticalTreeTest {

   CheckIdenticalTree classObj = new CheckIdenticalTree();

   @Test
   void test_isSame_expectTree_whenTreeIsSame() {
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      BinaryTreeNode left2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode tree2 = new BinaryTreeNode(1, left2, right2);

      Assertions.assertTrue(classObj.isSameTree(tree1, tree2));
   }

   @Test
   void test_isSame_expectTrue_whenBothEmptyTree() {
      Assertions.assertTrue(classObj.isSameTree(null, null));
   }

   @Test
   void test_isSame_expectFalse_whenDifferenceIs3_() {
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, null);

      BinaryTreeNode right2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree2 = new BinaryTreeNode(1, null, right2);

      Assertions.assertFalse(classObj.isSameTree(tree1, tree2));
   }

   @Test
   void test_isSame_expectFalse_whenDepthIs3_() {
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree2 = new BinaryTreeNode(1, left2, right2);

      Assertions.assertFalse(classObj.isSameTree(tree1, tree2));
   }
}
