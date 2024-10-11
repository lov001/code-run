package practice.trees;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BottomViewOfBinaryTreeTest {

   BottomViewOfBinaryTree classObj = new BottomViewOfBinaryTree();

   @Test
   void test_getTopView_expectList_whenTree() {
      BinaryTreeNode left32 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right31 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode right21 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, right21, left32);
      BinaryTreeNode right1 = new BinaryTreeNode(3, right11, right31);
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<Integer> actual = classObj.getBottomView(tree1);
      Assertions.assertEquals(4, actual.size());
      Assertions.assertEquals(List.of(7, 5, 8, 6), actual);
   }


   @Test
   void test_getTopView_expectList_whenTreeIs() {
      BinaryTreeNode right41 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left31 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, left31, right41);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<Integer> actual = classObj.getBottomView(tree1);
      Assertions.assertEquals(5, actual.size());
      Assertions.assertEquals(List.of(4, 2, 6, 3, 7), actual);
   }

}
