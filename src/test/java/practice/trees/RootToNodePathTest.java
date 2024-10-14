package practice.trees;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RootToNodePathTest {

   RootToNodePath classObj = new RootToNodePath();

   @Test
   void test_pathInATree_expect137_whenTreeIsBalanced() {
      BinaryTreeNode left3 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode right3 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left2 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right2 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
      BinaryTreeNode right1 = new BinaryTreeNode(3, left3, right3);
      BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

      Assertions.assertEquals(List.of(1, 3, 7), classObj.pathInATree(tree, 7));
   }

   @Test
   void test_pathInATree_expect31_whenDifferenceIs3_() {
      BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(1, null, null);
      BinaryTreeNode tree = new BinaryTreeNode(3, left1, right1);

      Assertions.assertEquals(List.of(3, 1), classObj.pathInATree(tree, 1));
   }
}
