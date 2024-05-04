package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckSubtreeTest {

   CheckSubtree classObj = new CheckSubtree();

   @Test
   void test_containsTree_expectTrue_whenTreeIsSubtree() {
      BinaryTreeNode left3 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left3, right3);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

      Assertions.assertTrue(classObj.containsTree(tree, right1));
      Assertions.assertTrue(classObj.containsTreeOptimal(tree, right1));
   }

   @Test
   void test_containsTree_expectTrue_whenEmptyTree() {
      Assertions.assertTrue(classObj.containsTree(null, null));
      Assertions.assertTrue(classObj.containsTreeOptimal(null, null));
   }

   @Test
   void test_containsTree_expectFalse_whenTreeIsNotSubtree() {
      BinaryTreeNode right3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(3, left3, right3);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      BinaryTreeNode right12 = new BinaryTreeNode(20, null, null);
      BinaryTreeNode tree2 = new BinaryTreeNode(17, null, right12);

      Assertions.assertFalse(classObj.containsTree(tree, tree2));
      Assertions.assertFalse(classObj.containsTreeOptimal(tree, tree2));
   }

   @Test
   void test_containsTree_expectFalse_whenRootIsSameButNotSubtree() {
      BinaryTreeNode right3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(3, null, right3);
      BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(3, left3, null);
      BinaryTreeNode right1 = new BinaryTreeNode(2, null, right2);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      BinaryTreeNode right11 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode tree2 = new BinaryTreeNode(2, left2, right11);

      Assertions.assertFalse(classObj.containsTree(tree, tree2));
      Assertions.assertFalse(classObj.containsTreeOptimal(tree, tree2));
   }
}
