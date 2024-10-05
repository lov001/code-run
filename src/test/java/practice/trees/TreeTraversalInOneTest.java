package practice.trees;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeTraversalInOneTest {

   TreeTraversalInOne classObj = new TreeTraversalInOne();

   @Test
   void test_preOrderTraversal_expectOrderedList_whenTreeHasNodes() {
      BinaryTreeNode left = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right = new BinaryTreeNode(2, left, null);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right);
      classObj.preInPostOrderTraversal(root);
      Assertions.assertEquals(Arrays.asList(1, 2, 3), classObj.findPreOrderTraversal());
   }

   @Test
   void test_preOrderTraversal_expectEmptyList_whenTreeHasNoNodes() {
      classObj.preInPostOrderTraversal(null);
      Assertions.assertEquals(Collections.emptyList(), classObj.findPreOrderTraversal());
   }

   @Test
   void test_preOrderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);
      classObj.preInPostOrderTraversal(root);
      Assertions.assertEquals(List.of(1), classObj.findPreOrderTraversal());
   }

   @Test
   void test_preOrderTraversal_expectOrderedList_whenTreeHas4Nodes() {
      BinaryTreeNode leftLeft = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left = new BinaryTreeNode(4, leftLeft, null);
      BinaryTreeNode right = new BinaryTreeNode(3, null, null);
      BinaryTreeNode root = new BinaryTreeNode(1, left, right);
      classObj.preInPostOrderTraversal(root);
      Assertions.assertEquals(Arrays.asList(1, 4, 2, 3), classObj.findPreOrderTraversal());
   }

   @Test
   void test_preOrderTraversal_expectOrderedList_whenTreeHasMultipleNodes() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);

      classObj.preInPostOrderTraversal(tree1);

      Assertions.assertEquals(List.of(25, 14, 8, 30, 28, 50), classObj.findPreOrderTraversal());
   }

   @Test
   void test_inorderTraversal_expectOrderedList_whenTreeHasNodes() {
      BinaryTreeNode left = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right = new BinaryTreeNode(2, left, null);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right);

      classObj.preInPostOrderTraversal(root);

      Assertions.assertEquals(Arrays.asList(1, 3, 2), classObj.findInOrderTraversal());
   }

   @Test
   void test_inorderTraversal_expectEmptyList_whenTreeHasNoNodes() {
      classObj.preInPostOrderTraversal(null);
      Assertions.assertEquals(Collections.emptyList(), classObj.findInOrderTraversal());
   }

   @Test
   void test_inorderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);

      classObj.preInPostOrderTraversal(root);

      Assertions.assertEquals(List.of(1), classObj.findInOrderTraversal());
   }

   @Test
   void test_inorderTraversal_expectList_whenTreeIsBST() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);

      classObj.preInPostOrderTraversal(tree1);

      Assertions.assertEquals(List.of(8, 14, 25, 28, 30, 50), classObj.findInOrderTraversal());
   }


   @Test
   void test_postOrderTraversal_expectOrderedList_whenTreeHasNodes() {
      BinaryTreeNode left = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right = new BinaryTreeNode(2, left, null);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right);

      classObj.preInPostOrderTraversal(root);

      Assertions.assertEquals(Arrays.asList(3, 2, 1), classObj.findPostOrderTraversal());
   }

   @Test
   void test_postOrderTraversal_expectEmptyList_whenTreeHasNoNodes() {
      classObj.preInPostOrderTraversal(null);

      Assertions.assertEquals(Collections.emptyList(), classObj.findPostOrderTraversal());
   }

   @Test
   void test_postOrderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);

      classObj.preInPostOrderTraversal(root);

      Assertions.assertEquals(List.of(1), classObj.findPostOrderTraversal());
   }

   @Test
   void test_postOrderTraversal_expectOrderedList_whenTreeHas4Nodes() {
      BinaryTreeNode leftLeft = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left = new BinaryTreeNode(4, leftLeft, null);
      BinaryTreeNode right = new BinaryTreeNode(3, null, null);
      BinaryTreeNode root = new BinaryTreeNode(1, left, right);

      classObj.preInPostOrderTraversal(root);

      Assertions.assertEquals(Arrays.asList(2, 4, 3, 1), classObj.findPostOrderTraversal());
   }

   @Test
   void test_postOrderTraversal_expectOrderedList_whenTreeHasMultipleNodes() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);

      classObj.preInPostOrderTraversal(tree1);

      Assertions.assertEquals(List.of(8, 14, 28, 50, 30, 25), classObj.findPostOrderTraversal());
   }

   @Test
   void test_postOrderTraversal_expectOrderedList_whenTreeHasMultipleNodes_() {

      BinaryTreeNode left31 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode right21 = new BinaryTreeNode(8, left31, null);
      BinaryTreeNode left12 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode right12 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, left12, right12);
      BinaryTreeNode left11 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, right21);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      classObj.preInPostOrderTraversal(tree1);

      Assertions.assertEquals(List.of(4, 6, 7, 5, 2, 9, 8, 3, 1),
         classObj.findPostOrderTraversal());
   }
}
