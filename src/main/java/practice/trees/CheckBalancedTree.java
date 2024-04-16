package practice.trees;


public class CheckBalancedTree {


   public boolean isBalanced(BinaryTreeNode root) {
      if (root == null) {
         return true;
      }
      return Math.abs(helper(root.left) - helper(root.right)) <= 1
         && isBalanced(root.left) && isBalanced(root.right);
   }

   private int helper(BinaryTreeNode node) {
      if (node == null) {
         return 0;
      }
      int left = helper(node.left);
      int right = helper(node.right);
      return 1 + Math.max(left, right);
   }
}
