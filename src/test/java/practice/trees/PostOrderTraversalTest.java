package practice.trees;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostOrderTraversalTest {

   PostOrderTraversal classObj = new PostOrderTraversal();

   @Test
   void test_postOrderTraversal_expectOrderedList_whenTreeHasNodes() {
      BinaryTreeNode left = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right = new BinaryTreeNode(2, left, null);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right);
      Assertions.assertEquals(Arrays.asList(3, 2, 1), classObj.postOrderTraversal(root));
      Assertions.assertEquals(Arrays.asList(3, 2, 1), classObj.postOrderTraversalIterativeUsing2Stacks(root));
   }

   @Test
   void test_postOrderTraversal_expectEmptyList_whenTreeHasNoNodes() {
      Assertions.assertEquals(Collections.emptyList(), classObj.postOrderTraversal(null));
      Assertions.assertEquals(Collections.emptyList(), classObj.postOrderTraversalIterativeUsing2Stacks(null));
   }

   @Test
   void test_postOrderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);
      Assertions.assertEquals(List.of(1), classObj.postOrderTraversal(root));
      Assertions.assertEquals(List.of(1), classObj.postOrderTraversalIterativeUsing2Stacks(root));
   }

   @Test
   void test_postOrderTraversal_expectOrderedList_whenTreeHas4Nodes() {
      BinaryTreeNode leftLeft = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left = new BinaryTreeNode(4, leftLeft, null);
      BinaryTreeNode right = new BinaryTreeNode(3, null, null);
      BinaryTreeNode root = new BinaryTreeNode(1, left, right);
      Assertions.assertEquals(Arrays.asList(2, 4, 3, 1), classObj.postOrderTraversal(root));
      Assertions.assertEquals(Arrays.asList(2, 4, 3, 1),
         classObj.postOrderTraversalIterativeUsing2Stacks(root));
   }

   @Test
   void test_postOrderTraversal_expectOrderedList_whenTreeHasMultipleNodes() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);

      Assertions.assertEquals(List.of(8, 14, 28, 50, 30, 25), classObj.postOrderTraversal(tree1));
      Assertions.assertEquals(List.of(8, 14, 28, 50, 30, 25),
         classObj.postOrderTraversalIterativeUsing2Stacks(tree1));
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

      Assertions.assertEquals(
         List.of(4, 6, 7, 5, 2, 9, 8, 3, 1), classObj.postOrderTraversal(tree1));
      Assertions.assertEquals(
         List.of(4, 6, 7, 5, 2, 9, 8, 3, 1), classObj.postOrderTraversalIterativeUsing2Stacks(tree1));
   }

}

