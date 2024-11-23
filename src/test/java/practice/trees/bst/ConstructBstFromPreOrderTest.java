package practice.trees.bst;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.trees.BinaryTreeNode;

public class ConstructBstFromPreOrderTest {

   BstFromPreOrder classObj = new BstFromPreOrder();

   @Test
   void test_proOderToBST_expectT1_whenGivenTraversals() {
      ArrayList<Integer> preOrder = new ArrayList<>();
      preOrder.add(20);
      preOrder.add(10);
      preOrder.add(5);
      preOrder.add(15);
      preOrder.add(13);
      preOrder.add(35);
      preOrder.add(30);
      preOrder.add(42);
      BinaryTreeNode left5 = new BinaryTreeNode(30, null, null);
      BinaryTreeNode right5 = new BinaryTreeNode(42, null, null);
      BinaryTreeNode left4 = new BinaryTreeNode(13, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(15, left4, null);
      BinaryTreeNode right1 = new BinaryTreeNode(35, left5, right5);
      BinaryTreeNode left1 = new BinaryTreeNode(10, left3, right3);
      BinaryTreeNode expected = new BinaryTreeNode(20, left1, right1);
      BinaryTreeNode actual = classObj.proOderToBST(preOrder);
      Assertions.assertEquals(expected.data, actual.data);
      Assertions.assertEquals(expected.left.data, actual.left.data);
      Assertions.assertEquals(expected.right.data, actual.right.data);
      Assertions.assertEquals(expected.left.left.data, actual.left.left.data);
      Assertions.assertEquals(expected.left.right.data, actual.left.right.data);
   }
}
