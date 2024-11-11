package practice.trees;

public class FlattenBinaryTree {

   static BinaryTreeNode prev = null;

   public BinaryTreeNode flattenBinaryTree(BinaryTreeNode root) {
      traverse(root);
      return prev;
   }

   private void traverse(BinaryTreeNode node) {
      if (node == null) {
         return;
      }
      traverse(node.right);
      traverse(node.left);
      node.right = prev;
      node.left = null;
      prev = node;
   }
}
