package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class FloorInBstTest {

   FloorInBst classObj = new FloorInBst();

   @Test
   void test_floorInBST_expect2_whenXIs4() {
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(6, null, right3);
      BinaryTreeNode left2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(8, left1, right1);
      Assertions.assertEquals(2, classObj.floorInBST(tree, 4));
   }

   @Test
   void test_floorInBST_expect7_whenXIs7() {
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(6, null, right3);
      BinaryTreeNode left2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(8, left1, right1);
      Assertions.assertEquals(7, classObj.floorInBST(tree, 7));
   }

   @Test
   void test_floorInBST_expect8_whenXIs9() {
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(6, null, right3);
      BinaryTreeNode left2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(8, left1, right1);
      Assertions.assertEquals(8, classObj.floorInBST(tree, 9));
   }
}
