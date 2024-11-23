package practice.trees.bst;

import java.util.Stack;
import practice.trees.BinaryTreeNode;

public class BstIterator {

   private static Stack<BinaryTreeNode> stack;

   BstIterator(BinaryTreeNode root) {
      stack = new Stack<>();
      stack.push(root);
      BinaryTreeNode node = root.left;
      pushAllLeft(node);
   }

   public int next() {
      int next = -1;
      if (!hasNext()) {
         return -1;
      }
      BinaryTreeNode node = stack.pop();
      if (node.right == null) {
         return node.data;
      }
      next = node.data;
      node = node.right;
      pushAllLeft(node);
      return next;
   }

   public boolean hasNext() {
      return !stack.isEmpty();
   }

   private void pushAllLeft(BinaryTreeNode node) {
      while (node != null) {
         stack.push(node);
         node = node.left;
      }
   }
}
