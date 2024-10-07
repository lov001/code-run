package practice.trees;

public class MaxDepthOfBinaryTree {

   public int maxDepth(BinaryTreeNode root) {
      if (root == null) {
         return 0;
      }
      return helper(root);
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
