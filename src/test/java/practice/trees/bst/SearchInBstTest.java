package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class SearchInBstTest {

   SearchInBst classObj = new SearchInBst();

   @Test
   void test_searchInBST_expectFalse_whenTreeDoesNotContainNode() {
      BinaryTreeNode left3 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left3, right3);
      BinaryTreeNode right1 = new BinaryTreeNode(6, left2, right2);
      BinaryTreeNode tree = new BinaryTreeNode(4, left1, right1);

      Assertions.assertFalse(classObj.searchInBST(tree, 8));
   }

   @Test
   void test_searchInBST_expectFalse_whenEmptyTree() {
      Assertions.assertFalse(classObj.searchInBST(null, 2));
   }

   @Test
   void test_searchInBST_expectTrue_whenDifferenceIs3_() {
      BinaryTreeNode right2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(1, null, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

      Assertions.assertTrue(classObj.searchInBST(tree, 1));
   }
}
