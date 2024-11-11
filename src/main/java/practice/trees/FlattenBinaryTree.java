package practice.trees;

import java.util.Stack;

public class FlattenBinaryTree {

   static BinaryTreeNode prev = null;

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
