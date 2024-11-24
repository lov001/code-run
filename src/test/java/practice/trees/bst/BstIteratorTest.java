package practice.trees.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class BstIteratorTest {

   @Test
   void test_BstIterator_validateOperations() {
      BinaryTreeNode left32 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode left31 = new BinaryTreeNode(5, left32, null);
      BinaryTreeNode left3 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(2, left3, null);
      BinaryTreeNode right3 = new BinaryTreeNode(6, left31, null);
      BinaryTreeNode left12 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(9, left12, null);
      BinaryTreeNode left1 = new BinaryTreeNode(3, left2, right3);
      BinaryTreeNode right1 = new BinaryTreeNode(10, left11, null);
      BinaryTreeNode tree = new BinaryTreeNode(7, left1, right1);
      BstIterator iterator = new BstIterator(tree);
      Assertions.assertEquals(1, iterator.next());
      Assertions.assertEquals(2, iterator.next());
      Assertions.assertEquals(3, iterator.next());
      Assertions.assertTrue(iterator.hasNext());
      Assertions.assertEquals(4, iterator.next());
      Assertions.assertEquals(5, iterator.next());
      Assertions.assertEquals(6, iterator.next());
      Assertions.assertEquals(7, iterator.next());
      Assertions.assertEquals(8, iterator.next());
      Assertions.assertEquals(9, iterator.next());
      Assertions.assertEquals(10, iterator.next());
      Assertions.assertFalse(iterator.hasNext());
   }
}
