package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class ValidateBst {

   public boolean validateBST(BinaryTreeNode root) {
      if (root == null) {
         return true;
      }
      return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
   }

   private boolean helper(BinaryTreeNode node, int leftRange, int rightRange) {
      if (node == null) {
         return true;
      }
      if (node.data >= leftRange && node.data < rightRange) {
         boolean left = helper(node.left, leftRange, node.data);
         boolean right = helper(node.right, node.data, rightRange);
         return left && right;
      } else {
         return false;
      }
   }
}
