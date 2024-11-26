package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class RecoverBstTest {

   RecoverBst classObj = new RecoverBst();

   @Test
   void test_fixBST_expect_whenNodesAreNotAdjacent() {
      BinaryTreeNode left4 = new BinaryTreeNode(13, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(15, left4, null);
      BinaryTreeNode right2 = new BinaryTreeNode(42, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(30, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(35, left3, right3);
      BinaryTreeNode right1 = new BinaryTreeNode(10, left2, right2);
      BinaryTreeNode tree = new BinaryTreeNode(20, left1, right1);
      BinaryTreeNode actual = classObj.fixBST(tree);
      Assertions.assertEquals(20, actual.data);
      Assertions.assertEquals(10, actual.left.data);
      Assertions.assertEquals(35, actual.right.data);
      Assertions.assertEquals(5, actual.left.left.data);
      Assertions.assertEquals(15, actual.left.right.data);
      Assertions.assertEquals(13, actual.left.right.left.data);
      Assertions.assertEquals(30, actual.right.left.data);
      Assertions.assertEquals(42, actual.right.right.data);
   }
}
