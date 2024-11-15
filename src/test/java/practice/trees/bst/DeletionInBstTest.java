package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class DeletionInBstTest {

   DeletionInBst classObj = new DeletionInBst();

   @Test
   void test_deleteNode_expectNodeDeleted_whenDeletedNodeIs5() {
      BinaryTreeNode left3 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(20, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left3, right3);
      BinaryTreeNode right1 = new BinaryTreeNode(16, null, right2);
      BinaryTreeNode tree = new BinaryTreeNode(10, left1, right1);
      BinaryTreeNode actual = classObj.deleteNode(tree, 5);

      tree.left = right3;

      Assertions.assertEquals(tree.data, actual.data);
      Assertions.assertEquals(tree.left.data, actual.left.data);
      Assertions.assertEquals(tree.right.data, actual.right.data);
      Assertions.assertEquals(tree.left.left.data, actual.left.left.data);
      Assertions.assertEquals(tree.right.right.data, actual.right.right.data);
   }
}
