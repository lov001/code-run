package practice.trees.bst;

import java.util.Stack;
import practice.trees.BinaryTreeNode;

public class BstIterator {

   private static Stack<BinaryTreeNode> leftStack;
   private static Stack<BinaryTreeNode> rightStack;

   BstIterator(BinaryTreeNode root) {
      leftStack = new Stack<>();
      leftStack.push(root);
      rightStack = new Stack<>();
      rightStack.push(root);
      pushAllLeft(root.left);
      pushAllRight(root.right);
   }

   public int next() {
      if (!hasNext()) {
         return -1;
      }
      BinaryTreeNode node = leftStack.pop();
      if (node.right == null) {
         return node.data;
      }
      pushAllLeft(node.right);
      return node.data;
   }

   public boolean hasNext() {
      return !leftStack.isEmpty();
   }

   private void pushAllLeft(BinaryTreeNode node) {
      while (node != null) {
         leftStack.push(node);
         node = node.left;
      }
   }

   public int before() {
      if (!hasBefore()) {
         return -1;
      }
      BinaryTreeNode node = rightStack.pop();
      if (node.left == null) {
         return node.data;
      }
      pushAllRight(node.left);
      return node.data;
   }

   public boolean hasBefore() {
      return !rightStack.isEmpty();
   }

   private void pushAllRight(BinaryTreeNode node) {
      while (node != null) {
         rightStack.push(node);
         node = node.right;
      }
   }
}
