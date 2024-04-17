package practice.trees;

public class Successor {

   public BinaryTreeNode successor(BinaryTreeNode root, BinaryTreeNode node) {
      if (root == null) {
         return null;
      }
      if (node.right != null) {
         return leftMostNode(node.right);
      }
      BinaryTreeNode successor = null;
      while (root != null) {
         if (node.data < root.data) {
            successor = root;
            root = root.left;
         } else if (node.data > root.data) {
            root = root.right;
         } else {
            break;
         }
      }
      return successor;
   }

   private BinaryTreeNode leftMostNode(BinaryTreeNode node) {
      if (node == null) {
         return null;
      }
      while (node.left != null) {
         node = node.left;
      }
      return node;
   }
}
