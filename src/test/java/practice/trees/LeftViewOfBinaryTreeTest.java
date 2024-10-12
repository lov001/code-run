package practice.trees;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftViewOfBinaryTreeTest {

   LeftViewOfBinaryTree classObj = new LeftViewOfBinaryTree();

   @Test
   void test_getLeftView_expectList_whenTree() {
      BinaryTreeNode right31 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, right31);
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<Integer> actual = classObj.printLeftViewIterative(tree1);
      Assertions.assertEquals(3, actual.size());
      Assertions.assertEquals(List.of(1, 2, 5), actual);
      Assertions.assertEquals(List.of(1, 2, 5), classObj.printLeftViewRecursive(tree1));
   }


   @Test
   void test_getLeftView_expectList_whenTreeIs() {
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, null, right1);

      List<Integer> actual = classObj.printLeftViewIterative(tree1);
      Assertions.assertEquals(2, actual.size());
      Assertions.assertEquals(List.of(1, 3), actual);
      Assertions.assertEquals(List.of(1, 3), classObj.printLeftViewRecursive(tree1));
   }

   @Test
   void test_getLeftView_expectList_whenTreeIsEmpty() {
      List<Integer> actual = classObj.printLeftViewIterative(null);
      Assertions.assertEquals(0, actual.size());
      Assertions.assertEquals(Collections.emptyList(), actual);
      Assertions.assertEquals(List.of(), classObj.printLeftViewRecursive(null));
   }

   @Test
   void test_getLeftView_expectList_whenTree_() {
      BinaryTreeNode right31 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left31 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left21 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(10, left31, right31);
      BinaryTreeNode left1 = new BinaryTreeNode(35, left21, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(2, left1, right1);

      List<Integer> actual = classObj.printLeftViewIterative(tree1);
      Assertions.assertEquals(3, actual.size());
      Assertions.assertEquals(List.of(2, 35, 2), actual);
      Assertions.assertEquals(List.of(2, 35, 2), classObj.printLeftViewRecursive(tree1));
   }

   @Test
   void test_getLeftView_expectList_whenTree_1() {
      BinaryTreeNode right31 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left21 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, right31);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left21, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<Integer> actual = classObj.printLeftViewIterative(tree1);
      Assertions.assertEquals(3, actual.size());
      Assertions.assertEquals(List.of(1, 2, 4), actual);
      Assertions.assertEquals(List.of(1, 2, 4), classObj.printLeftViewRecursive(tree1));
   }

}
