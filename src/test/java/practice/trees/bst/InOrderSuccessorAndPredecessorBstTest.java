package practice.trees.bst;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class InOrderSuccessorAndPredecessorBstTest {

   InOrderSuccessorAndPredecessorInBst classObj = new InOrderSuccessorAndPredecessorInBst();

   @Test
   void test_findPreSuc_expect2_whenXIs4() {
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(6, null, right3);
      BinaryTreeNode left2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(8, left1, right1);
      ArrayList<Integer> actual = classObj.findPreSuc(tree, 5);
      Assertions.assertEquals(2, actual.get(0));
      Assertions.assertEquals(6, actual.get(1));
   }

   @Test
   void test_findPreSuc_expect7_whenXIs7() {
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(6, null, right3);
      BinaryTreeNode left2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(8, left1, right1);
      ArrayList<Integer> actual = classObj.findPreSuc(tree, 2);
      Assertions.assertEquals(-1, actual.get(0));
      Assertions.assertEquals(5, actual.get(1));
   }

   @Test
   void test_findPreSuc_expect8_whenXIs9() {
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(6, null, right3);
      BinaryTreeNode left2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(8, left1, right1);
      ArrayList<Integer> actual = classObj.findPreSuc(tree, 10);
      Assertions.assertEquals(8, actual.get(0));
      Assertions.assertEquals(-1, actual.get(1));
   }
}
