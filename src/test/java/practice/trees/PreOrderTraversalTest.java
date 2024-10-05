package practice.trees;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PreOrderTraversalTest {

   PreOrderTraversal classObj = new PreOrderTraversal();

   @Test
   void test_preOrderTraversal_expectOrderedList_whenTreeHasNodes() {
      BinaryTreeNode left = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right = new BinaryTreeNode(2, left, null);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right);
      Assertions.assertEquals(Arrays.asList(1, 2, 3), classObj.preOrderTraversal(root));
      Assertions.assertEquals(Arrays.asList(1, 2, 3), classObj.preOrderTraversalIterative(root));
   }

   @Test
   void test_preOrderTraversal_expectEmptyList_whenTreeHasNoNodes() {
      Assertions.assertEquals(Collections.emptyList(), classObj.preOrderTraversal(null));
      Assertions.assertEquals(Collections.emptyList(), classObj.preOrderTraversalIterative(null));
   }

   @Test
   void test_preOrderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);
      Assertions.assertEquals(List.of(1), classObj.preOrderTraversal(root));
      Assertions.assertEquals(List.of(1), classObj.preOrderTraversalIterative(root));
   }

   @Test
   void test_preOrderTraversal_expectOrderedList_whenTreeHas4Nodes() {
      BinaryTreeNode leftLeft = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left = new BinaryTreeNode(4, leftLeft, null);
      BinaryTreeNode right = new BinaryTreeNode(3, null, null);
      BinaryTreeNode root = new BinaryTreeNode(1, left, right);
      Assertions.assertEquals(Arrays.asList(1, 4, 2, 3), classObj.preOrderTraversal(root));
      Assertions.assertEquals(Arrays.asList(1, 4, 2, 3), classObj.preOrderTraversalIterative(root));
   }

   @Test
   void test_preOrderTraversal_expectOrderedList_whenTreeHasMultipleNodes() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);

      Assertions.assertEquals(List.of(25, 14, 8, 30, 28, 50), classObj.preOrderTraversal(tree1));
      Assertions.assertEquals(List.of(25, 14, 8, 30, 28, 50),
         classObj.preOrderTraversalIterative(tree1));
   }

}

