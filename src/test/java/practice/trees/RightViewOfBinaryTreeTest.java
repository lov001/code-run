package practice.trees;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RightViewOfBinaryTreeTest {

   RightViewOfBinaryTree classObj = new RightViewOfBinaryTree();

   @Test
   void test_getRightView_expectList_whenTree() {
      BinaryTreeNode right31 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, right31);
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<Integer> actual = classObj.getRightViewIterative(tree1);
      Assertions.assertEquals(3, actual.size());
      Assertions.assertEquals(List.of(1, 3, 4), actual);
      Assertions.assertEquals(List.of(1, 3, 4), classObj.getRightViewRecursive(tree1));
   }


   @Test
   void test_getRightView_expectList_whenTreeIs() {
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, null, right1);

      List<Integer> actual = classObj.getRightViewIterative(tree1);
      Assertions.assertEquals(2, actual.size());
      Assertions.assertEquals(List.of(1, 3), actual);
      Assertions.assertEquals(List.of(1, 3), classObj.getRightViewRecursive(tree1));
   }

   @Test
   void test_getRightView_expectList_whenTreeIsEmpty() {
      List<Integer> actual = classObj.getRightViewIterative(null);
      Assertions.assertEquals(0, actual.size());
      Assertions.assertEquals(Collections.emptyList(), actual);
      Assertions.assertEquals(List.of(), classObj.getRightViewRecursive(null));
   }

}
