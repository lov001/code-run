package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class LargestBstInBinaryTree {

   public int largestBST(BinaryTreeNode root) {
      return traverse(root).maxSize;
   }

   private NodeEntry traverse(BinaryTreeNode node) {
      if (node == null) {
         return new NodeEntry(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
      }
      NodeEntry left = traverse(node.left);
      NodeEntry right = traverse(node.right);
      if (left.maxNode < node.data && node.data < right.minNode) {
         return new NodeEntry(Math.min(node.data, left.minNode), Math.max(node.data, right.maxNode),
            1 + left.maxSize + right.maxSize);
      }
      return new NodeEntry(Integer.MIN_VALUE, Integer.MAX_VALUE,
         Math.max(left.maxSize, right.maxSize));
   }

   public static class NodeEntry {

      public int minNode;
      public int maxNode;
      public int maxSize;

      public NodeEntry(int minNode, int maxNode, int maxSize) {
         this.minNode = minNode;
         this.maxNode = maxNode;
         this.maxSize = maxSize;
      }
   }
}
