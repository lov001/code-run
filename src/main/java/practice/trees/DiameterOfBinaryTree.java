package practice.trees;

public class DiameterOfBinaryTree {

   public int diameterOfBinaryTree(BinaryTreeNode root) {
      if (root == null) {
         return 0;
      }
      int[] diameter = {0};
      height(root, diameter);
      return diameter[0];
   }

   private int height(BinaryTreeNode node, int[] diameter) {
      if (node == null) {
         return 0;
      }
      int leftHeight = height(node.left, diameter);
      int rightHeight = height(node.right, diameter);
      diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
      return 1 + Math.max(leftHeight, rightHeight);
   }
}
