package practice.trees;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InOrderTraversalTest {

   @Test
   void test_inorderTraversal_expectOrderedList_whenTreeHasNodes() {
      BinaryTreeNode left = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right = new BinaryTreeNode(2, left, null);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right);
      Assertions.assertEquals(Arrays.asList(1, 3, 2), InOrderTraversal.inOrderTraversal(root));
      Assertions.assertEquals(Arrays.asList(1, 3, 2),
         InOrderTraversal.inOrderTraversalIterative(root));
      Assertions.assertEquals(Arrays.asList(1, 3, 2),
         InOrderTraversal.inOrderTraversalIterative2(root));

      Assertions.assertEquals(Arrays.asList(1, 3, 2), MorrisTraversal.getInOrderTraversal(root));
   }

   @Test
   void test_inorderTraversal_expectEmptyList_whenTreeHasNoNodes() {
      Assertions.assertEquals(Collections.emptyList(), InOrderTraversal.inOrderTraversal(null));
      Assertions.assertEquals(Collections.emptyList(),
         InOrderTraversal.inOrderTraversalIterative(null));
      Assertions.assertEquals(Collections.emptyList(),
         InOrderTraversal.inOrderTraversalIterative2(null));
      Assertions.assertEquals(Collections.emptyList(), MorrisTraversal.getInOrderTraversal(null));
   }

   @Test
   void test_inorderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);
      Assertions.assertEquals(List.of(1), InOrderTraversal.inOrderTraversal(root));
      Assertions.assertEquals(List.of(1), InOrderTraversal.inOrderTraversalIterative(root));
      Assertions.assertEquals(List.of(1), InOrderTraversal.inOrderTraversalIterative2(root));
   }

   @Test
   void test_inorderTraversal_expectList_whenTreeIsBST() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(25, left1, right1);

      Assertions.assertEquals(List.of(8, 14, 25, 28, 30, 50),
         InOrderTraversal.inOrderTraversal(tree1));
      Assertions.assertEquals(List.of(8, 14, 25, 28, 30, 50),
         InOrderTraversal.inOrderTraversalIterative(tree1));
      Assertions.assertEquals(List.of(8, 14, 25, 28, 30, 50),
         InOrderTraversal.inOrderTraversalIterative2(tree1));

      Assertions.assertEquals(Arrays.asList(8, 14, 25, 28, 30, 50), MorrisTraversal.getInOrderTraversal(tree1));
   }

}

