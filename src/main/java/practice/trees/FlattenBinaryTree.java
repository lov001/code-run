package practice.trees;

import java.util.Stack;

public class FlattenBinaryTree {

   static BinaryTreeNode prev = null;

   public BinaryTreeNode flattenBinaryTreeMorrisTraversal(BinaryTreeNode root) {
      BinaryTreeNode current = root;
      while (current != null) {
         if (current.left != null) {
            BinaryTreeNode prev = current.left;
            while (prev.right != null) {
               prev = prev.right;
            }
            prev.right = current.right;
            current.right = current.left;
         }
         current = current.right;
      }
      return root;
   }

   public BinaryTreeNode flattenBinaryTreeIterative(BinaryTreeNode root) {
      Stack<BinaryTreeNode> stack = new Stack<>();
      stack.push(root);
      while (!stack.isEmpty()) {
         BinaryTreeNode current = stack.pop();
         if (current.right != null) {
            stack.push(current.right);
         }
         if (current.left != null) {
            stack.push(current.left);
         }
         if (!stack.isEmpty()) {
            current.right = stack.peek();
         }
         current.left = null;
      }
      return root;
   }

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
