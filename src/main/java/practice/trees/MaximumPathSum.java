package practice.trees;

public class MaximumPathSum {

   public int maxPathSum(BinaryTreeNode root) {
      if (root == null) {
         return 0;
      }
      int[] maxPathSum = {Integer.MIN_VALUE};
      helper(root, maxPathSum);
      return maxPathSum[0];
   }

   private int helper(BinaryTreeNode node, int[] maxPathSum) {
      if (node == null) {
         return 0;
      }
      int left = Math.max(0, helper(node.left, maxPathSum));
      int right = Math.max(0, helper(node.right, maxPathSum));
      maxPathSum[0] = Math.max(maxPathSum[0], left + right + node.data);
      return node.data + Math.max(left, right);
   }
}
