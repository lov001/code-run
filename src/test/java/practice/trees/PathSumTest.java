package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumTest {

   PathSum clasObj = new PathSum();

   @Test
   void test_pathSum_expect2_whenThereAreTwoPathsWithTargetSum() {
      BinaryTreeNode right3 = new BinaryTreeNode(11, null, null);
      BinaryTreeNode right4 = new BinaryTreeNode(-2, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode left3 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(3, left3, right4);
      BinaryTreeNode right1 = new BinaryTreeNode(-3, null, right3);
      BinaryTreeNode left1 = new BinaryTreeNode(5, left2, right2);
      BinaryTreeNode tree = new BinaryTreeNode(10, left1, right1);

      Assertions.assertEquals(2, clasObj.paths(tree, 8));
   }
}
