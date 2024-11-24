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
      if (!hasNext()) {
         return -1;
      }
      BinaryTreeNode node = stack.pop();
      if (node.right == null) {
         return node.data;
      }
      pushAllLeft(node.right);
      return node.data;
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
