package practice.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBinaryTree {

   public int maxDepth(BinaryTreeNode root) {
      if (root == null) {
         return 0;
      }
      return helper(root);
   }

   public int maxDepthLevelOrder(BinaryTreeNode root) {
      if (root == null) {
         return 0;
      }
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      queue.offer(root);
      int level = 0;
      while (true) {
         int size = queue.size();
         if (size == 0) {
            break;
         }
         for (int i = 0; i < size; i++) {
            BinaryTreeNode node = queue.peek();
            if (node.left != null) {
               queue.offer(node.left);
            }
            if (node.right != null) {
               queue.offer(node.right);
            }
            queue.poll();
         }
         level++;
      }
      return level;
   }

   private int helper(BinaryTreeNode node) {
      if (node == null) {
         return 0;
      }
      int left = helper(node.left);
      int right = helper(node.right);
      return 1 + Math.max(left, right);
   }
}
