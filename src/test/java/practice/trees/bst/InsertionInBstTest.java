package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class InsertionInBstTest {

   InsertionInBst classObj = new InsertionInBst();

   @Test
   void test_insertionInBST_expectFalse_whenTreeDoesNotContainNode() {
      BinaryTreeNode left3 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(13, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left3, right3);
      BinaryTreeNode right1 = new BinaryTreeNode(12, null, right2);
      BinaryTreeNode tree = new BinaryTreeNode(10, left1, right1);
      BinaryTreeNode actual = classObj.insertionInBST(tree, 11);

      BinaryTreeNode left3_ = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right3_ = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right2_ = new BinaryTreeNode(13, null, null);
      BinaryTreeNode left12_ = new BinaryTreeNode(11, left3_, right3_);
      BinaryTreeNode left1_ = new BinaryTreeNode(2, left3_, right3_);
      BinaryTreeNode right1_ = new BinaryTreeNode(12, left12_, right2_);
      BinaryTreeNode expected = new BinaryTreeNode(10, left1_, right1_);

      Assertions.assertEquals(expected.data, actual.data);
      Assertions.assertEquals(expected.left.data, actual.left.data);
      Assertions.assertEquals(expected.right.data, actual.right.data);
      Assertions.assertEquals(expected.left.left.data, actual.left.left.data);
      Assertions.assertEquals(expected.left.right.data, actual.left.right.data);
      Assertions.assertEquals(expected.right.right.data, actual.right.right.data);
   }

   @Test
   void test_insertionInBST_expect4InsertedAtLastNode_whenOnly2Nodes() {
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(1, null, right1);
      BinaryTreeNode actual = classObj.insertionInBST(tree, 4);

      BinaryTreeNode right12 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(3, null, right12);
      BinaryTreeNode expected = new BinaryTreeNode(1, null, right11);
      Assertions.assertEquals(expected.data, actual.data);
      Assertions.assertEquals(expected.right.data, actual.right.data);
      Assertions.assertEquals(expected.right.right.data, actual.right.right.data);
   }
}
