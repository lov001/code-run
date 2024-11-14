package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class InsertionInBst {

   public BinaryTreeNode insertionInBST(BinaryTreeNode root, int val) {
      if (root == null) {
         return new BinaryTreeNode(val);
      }
      BinaryTreeNode node = root;
      while (true) {
         if (node.data <= val) {
            if (node.right != null) {
               node = node.right;
            } else {
               node.right = new BinaryTreeNode(val);
               break;
            }
         } else {
            if (node.left != null) {
               node = node.left;
            } else {
               node.left = new BinaryTreeNode(val);
               break;
            }
         }
      }
      return root;
   }
}
