package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SerializeAndDeserializeBinaryTreeTest {

   SerializeAndDeserializeBinaryTree classObj = new SerializeAndDeserializeBinaryTree();

   @Test
   void test_serializeTree_expect13_whenNodesAre2() {
      BinaryTreeNode right = new BinaryTreeNode(3);
      BinaryTreeNode root = new BinaryTreeNode(1, null, right);
      Assertions.assertEquals("1 -1 3 -1 -1", classObj.serializeTree(root));
   }

   @Test
   void test_serializeTree_expect12345_whenNodesAre5() {
      BinaryTreeNode left1 = new BinaryTreeNode(5);
      BinaryTreeNode right1 = new BinaryTreeNode(4);
      BinaryTreeNode right = new BinaryTreeNode(3, left1, null);
      BinaryTreeNode left = new BinaryTreeNode(2, null, right1);
      BinaryTreeNode root = new BinaryTreeNode(1, left, right);
      Assertions.assertEquals("1 2 3 -1 4 5 -1 -1 -1 -1 -1", classObj.serializeTree(root));
   }
}
