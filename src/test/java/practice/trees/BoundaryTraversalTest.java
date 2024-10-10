package practice.trees;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoundaryTraversalTest {

   BoundaryTraversal classOBj = new BoundaryTraversal();

   @Test
   void test_boundaryTraversal_expectOrderedList_whenTreeHasNodes() {
      BinaryTreeNode left = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right = new BinaryTreeNode(2, left, null);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right);
      Assertions.assertEquals(Arrays.asList(1, 3, 2), classOBj.traverseBoundary(root));
   }

   @Test
   void test_boundaryTraversal_expectEmptyList_whenTreeHasNoNodes() {
      Assertions.assertEquals(Collections.emptyList(), classOBj.traverseBoundary(null));
   }

   @Test
   void test_boundaryTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);
      Assertions.assertEquals(List.of(1), classOBj.traverseBoundary(root));
   }

   @Test
   void test_boundaryTraversal_expectList_whenTreeIsBST() {
      BinaryTreeNode left21 = new BinaryTreeNode(18, null, null);
      BinaryTreeNode right21 = new BinaryTreeNode(25, null, null);
      BinaryTreeNode left12 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(8, left12, null);
      BinaryTreeNode left11 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left21, right21);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(10, left1, right1);

      Assertions.assertEquals(List.of(10, 5, 3, 7, 18, 25, 20), classOBj.traverseBoundary(tree1));
   }

   @Test
   void test_boundaryTraversal_expectList_whenTree() {
      BinaryTreeNode left21 = new BinaryTreeNode(140, null, null);
      BinaryTreeNode right21 = new BinaryTreeNode(200, null, null);
      BinaryTreeNode right14 = new BinaryTreeNode(35, null, null);
      BinaryTreeNode right13 = new BinaryTreeNode(30, null, right14);
      BinaryTreeNode right15 = new BinaryTreeNode(80, null, null);
      BinaryTreeNode left12 = new BinaryTreeNode(70, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(75, left12, right15);
      BinaryTreeNode left11 = new BinaryTreeNode(25, null, right13);
      BinaryTreeNode right1 = new BinaryTreeNode(150, left21, right21);
      BinaryTreeNode left1 = new BinaryTreeNode(50, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(100, left1, right1);

      Assertions.assertEquals(List.of(100, 50, 25, 30, 35, 70, 80, 140, 200, 150),
         classOBj.traverseBoundary(tree1));
   }

}

