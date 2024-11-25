package practice.trees.bst;

import java.util.Stack;
import practice.trees.BinaryTreeNode;

public class TwoSumInBst {

   public boolean twoSumInBST(BinaryTreeNode root, int target) {
      BstIterator iterator = new BstIterator(root);
      int left = iterator.next();
      int right = iterator.before();
      while (left != -1 && right != -1) {
         int current = left + right;
         if (current == target) {
            return true;
         } else if (current < target) {
            left = iterator.next();
         } else {
            right = iterator.before();
         }
      }
      return false;
   }

   public boolean twoSumInBSTOptimised(BinaryTreeNode root, int target) {
      if (root == null) {
         return false;
      }
      BstIteratorOptimised leftIterator = new BstIteratorOptimised(root, false);
      BstIteratorOptimised rightIterator = new BstIteratorOptimised(root, true);
      int left = leftIterator.next();
      int right = rightIterator.next();
      while (left < right) {
         int current = left + right;
         if (current == target) {
            return true;
         } else if (current < target) {
            left = leftIterator.next();
         } else {
            right = rightIterator.next();
         }
      }
      return false;
   }

   public static class BstIteratorOptimised {

      private final Stack<BinaryTreeNode> stack;
      private final boolean reverse;

      BstIteratorOptimised(BinaryTreeNode root, boolean isReverse) {
         reverse = isReverse;
         stack = new Stack<>();
         pushAll(root);
      }

      public int next() {
         BinaryTreeNode node = stack.pop();
         if (!reverse) {
            pushAll(node.right);
         } else {
            pushAll(node.left);
         }
         return node.data;
      }

      private void pushAll(BinaryTreeNode node) {
         while (node != null) {
            stack.push(node);
            if (reverse) {
               node = node.right;
            } else {
               node = node.left;
            }
         }
      }
   }
}
