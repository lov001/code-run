package practice.trees;

public class SymmetricBinaryTree {

   public boolean isSymmetric(BinaryTreeNode root) {
      if (root == null) {
         return true;
      }
      return traversal(root.left, root.right);
   }

   private boolean traversal(BinaryTreeNode left, BinaryTreeNode right) {
      if (left == null || right == null) {
         return left == right;
      }
      if (left.data != right.data) {
         return false;
      }
      return traversal(left.left, right.right) && traversal(left.right, right.left);
   }


}
