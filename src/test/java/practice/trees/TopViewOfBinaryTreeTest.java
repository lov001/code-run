package practice.trees;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopViewOfBinaryTreeTest {

   TopViewOfBinaryTree classObj = new TopViewOfBinaryTree();

   @Test
   void test_getTopView_expectList_whenTree() {
      BinaryTreeNode right41 = new BinaryTreeNode(11, null, null);
      BinaryTreeNode left41 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode left31 = new BinaryTreeNode(9, left41, null);
      BinaryTreeNode left32 = new BinaryTreeNode(8, null, right41);
      BinaryTreeNode right31 = new BinaryTreeNode(6, left32, null);
      BinaryTreeNode right21 = new BinaryTreeNode(7, left31, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(4, null, right21);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, right31);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<Integer> actual = classObj.getTopView(tree1);
      Assertions.assertEquals(6, actual.size());
      Assertions.assertEquals(List.of(10, 4, 2, 1, 3, 6), actual);
   }


   @Test
   void test_getTopView_expectList_whenTreeIs() {
      BinaryTreeNode right41 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left41 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode left31 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode right21 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(4, left41, right21);
      BinaryTreeNode right1 = new BinaryTreeNode(3, left31, right41);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<Integer> actual = classObj.getTopView(tree1);
      Assertions.assertEquals(6, actual.size());
      Assertions.assertEquals(List.of(8, 4, 2, 1, 3, 7), actual);
   }

}
