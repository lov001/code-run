package practice.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {

   public int getMaxWidth(BinaryTreeNode root) {
      if (root == null) {
         return 0;
      }
      Queue<Pair> queue = new LinkedList<>();
      queue.offer(new Pair(root, 0));
      int ans = 0;
      while (!queue.isEmpty()) {
         int size = queue.size();
         int min = queue.peek().num;
         int first = 0;
         int last = 0;
         for (int i = 0; i < size; i++) {
            int current = queue.peek().num - min;
            BinaryTreeNode node = queue.peek().node;
            queue.poll();
            if (i == 0) {
               first = current;
            }
            if (i == size - 1) {
               last = current;
            }
            if (node.left != null) {
               queue.offer(new Pair(node.left, current * 2 + 1));
            }
            if (node.right != null) {
               queue.offer(new Pair(node.right, (current * 2) + 2));
            }
         }
         ans = Math.max(ans, last - first + 1);
      }
      return ans;
   }

   private static class Pair {

      BinaryTreeNode node;
      int num;

      public Pair(BinaryTreeNode node, int num) {
         this.node = node;
         this.num = num;
      }
   }
}
