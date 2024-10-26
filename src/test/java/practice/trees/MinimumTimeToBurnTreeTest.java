package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumTimeToBurnTreeTest {

   MinimumTimeToBurnTree classObj = new MinimumTimeToBurnTree();

   @Test
   void test_timeToBurnTree_expect2_whenNoOfNodeIs5() {
      BinaryTreeNode left12 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);
      Assertions.assertEquals(2, classObj.timeToBurnTree(tree1, 3));
   }
}
