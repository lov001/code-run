package practice.trees;


public class CheckBalancedTree {


   public boolean isBalanced(BinaryTreeNode root) {
      if (root == null) {
         return true;
      }
      if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
         return false;
      }
      return isBalanced(root.left) && isBalanced(root.right);
   }

   private int getHeight(BinaryTreeNode node) {
      if (node == null) {
         return 0;
      }
      int left = getHeight(node.left);
      int right = getHeight(node.right);
      return 1 + Math.max(left, right);
   }


   public boolean isBalancedOptimised(BinaryTreeNode root) {
      return checkHeight(root) != Integer.MIN_VALUE;
   }

   private int checkHeight(BinaryTreeNode node) {
      if (node == null) {
         return -1;
      }
      int leftHeight = checkHeight(node.left);
      if (leftHeight == Integer.MIN_VALUE) {
         return Integer.MIN_VALUE;
      }
      int rightHeight = checkHeight(node.right);
      if (rightHeight == Integer.MIN_VALUE) {
         return Integer.MIN_VALUE;
      }
      int heightDifference = Math.abs(leftHeight - rightHeight);
      if (heightDifference > 1) {
         return Integer.MIN_VALUE;
      } else {
         return Math.max(leftHeight, rightHeight) + 1;
      }
   }
}
