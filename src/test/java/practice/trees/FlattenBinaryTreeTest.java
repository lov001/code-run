package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlattenBinaryTreeTest {

   FlattenBinaryTree classObj = new FlattenBinaryTree();

   @Test
   void test_flattenBinaryTree_expectLinkedList_whenNoOfNodeIs5() {
      BinaryTreeNode left12 = new BinaryTreeNode(10, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(20, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(62, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(40, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(15, left1, right1);
      BinaryTreeNode actual = classObj.flattenBinaryTree(tree1);
      Assertions.assertEquals(tree1.data, actual.data);
      Assertions.assertEquals(left1.data, actual.right.data);
      Assertions.assertEquals(right1.data, actual.right.right.data);
      Assertions.assertEquals(left12.data, actual.right.right.right.data);
      Assertions.assertEquals(right11.data, actual.right.right.right.right.data);
   }
}
