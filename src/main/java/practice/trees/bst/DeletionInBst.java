package practice.trees.bst;

import practice.trees.BinaryTreeNode;

public class DeletionInBst {

   public BinaryTreeNode deleteNode(BinaryTreeNode root, int key) {
      if (root == null) {
         return null;
      }
      if (root.data == key) {
         return helper(root);
      }
      BinaryTreeNode node = root;
      while (node != null) {
         if (node.data > key) {
            if (node.left != null && node.left.data == key) {
               node.left = helper(node.left);
            } else {
               node = node.left;
            }
         } else {
            if (node.right != null && node.right.data == key) {
               node.right = helper(node.right);
            } else {
               node = node.right;
            }
         }
      }
      return root;
   }

   private BinaryTreeNode helper(BinaryTreeNode node) {
      if (node.left == null) {
         return node.right;
      } else if (node.right == null) {
         return node.left;
      } else {
         BinaryTreeNode leftChild = node.left;
         BinaryTreeNode lastLeft = findLastLeft(node.right);
         lastLeft.left = leftChild;
         return node.right;
      }
   }

   private BinaryTreeNode findLastLeft(BinaryTreeNode node) {
      if (node.left == null) {
         return node;
      }
      return findLastLeft(node.left);
   }
}
