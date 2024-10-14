package practice.trees;

public class LowestCommonAncestor {

   public BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p,
      BinaryTreeNode q) {
      if (root == null || root == p || root == q) {
         return root;
      }
      BinaryTreeNode left = lowestCommonAncestor(root.left, p, q);
      BinaryTreeNode right = lowestCommonAncestor(root.right, p, q);
      if (left == null) {
         return right;
      } else if (right == null) {
         return left;
      } else {
         return root;
      }
   }
}
