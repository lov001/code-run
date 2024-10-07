package practice.trees;

public class BalancedBinaryTree {

   public boolean isBalancedOptimised(BinaryTreeNode root) {
      if (root == null) {
         return true;
      }
      return heightOptimised(root) != -1;
   }

   private int heightOptimised(BinaryTreeNode node) {
      if (node == null) {
         return 0;
      }
      int left = heightOptimised(node.left);
      if (left == -1) {
         return -1;
      }
      int right = heightOptimised(node.right);
      if (right == -1) {
         return -1;
      }
      if (Math.abs(left - right) > 1) {
         return -1;
      }
      return 1 + Math.max(left, right);
   }

   public boolean isBalanced(BinaryTreeNode root) {
      if (root == null) {
         return true;
      }
      if (Math.abs(height(root.left) - height(root.right)) > 1) {
         return false;
      }
      return isBalanced(root.left) && isBalanced(root.right);
   }


   private int height(BinaryTreeNode node) {
      if (node == null) {
         return 0;
      }
      int left = height(node.left);
      int right = height(node.right);
      return 1 + Math.max(left, right);
   }
}
