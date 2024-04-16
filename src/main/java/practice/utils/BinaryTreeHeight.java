package practice.utils;

import practice.trees.BinaryTreeNode;

public class BinaryTreeHeight {


   public int height(BinaryTreeNode root) {
      if (root == null) {
         return -1;
      }
      return helper(root);
   }

   private int helper(BinaryTreeNode node) {
      if (node == null) {
         return 0;
      }
      int left = helper(node.left);
      int right = helper(node.right);
      return Math.max(left, right) + 1;
   }
}
